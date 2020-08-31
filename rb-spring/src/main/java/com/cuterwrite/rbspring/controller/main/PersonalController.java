package com.cuterwrite.rbspring.controller.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.dao.PostMapper;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.service.UserService;
import com.cuterwrite.rbspring.util.PasswordEncrypter;
import com.cuterwrite.rbspring.util.ResultGenerator;

import cn.hutool.core.util.StrUtil;

@Controller
public class PersonalController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostMapper postMapper;
	
	@GetMapping({"/register","register.html"})
	public String registerPage() {
		return "main/register";
	}
	
	@GetMapping({"/login","login.html"})
	public String loginPage() {
		return "main/login";
	}
	
	@PostMapping("/register")
	@ResponseBody
	public Result register(@RequestParam("userAccount")String userAccount,
			@RequestParam("userName")String userName,@RequestParam("gender")String gender,
			@RequestParam("major")String major,@RequestParam("grade")String grade,
			@RequestParam("password")String password,@RequestParam("confirm")String confirm) {
		
		if(StrUtil.isEmpty(userAccount)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.USER_ACCOUNT_NULL.getResult());
		}
		if(StrUtil.isEmpty(userName)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.USER_NAME_NULL.getResult());
		}
		if(StrUtil.isEmpty(password)||StrUtil.isEmpty(confirm)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.PASSWORD_NULL.getResult());
		}
		if(!"男".equals(gender)&&!"女".equals(gender)) {
			gender="";
		}
		
		User user=new User();
		user.setUserAccount(userAccount);
		user.setUserName(userName);
		user.setUserType("学生");
		user.setPassword(PasswordEncrypter.encrypt(password));
		
		Student student=new Student();
		student.setStuId(userAccount);
		student.setStuName(userName);
		student.setStuGrade(grade);
		student.setStuGender(gender);
		student.setStuMajor(major);
		
		String registerResult=userService.register(user, student);
		
		//注册成功
		if(ServiceResultEnum.SUCCESS.getResult().equals(registerResult)) {
			return ResultGenerator.genSuccessResult();
		}
		
		return ResultGenerator.genFailResult(registerResult);
	}
	
	@PostMapping("/login")
	@ResponseBody
	public Result login(@RequestParam("userAccount")String userAccount,@RequestParam("password")String password,HttpSession session) {
		
		if(StrUtil.isEmpty(userAccount)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.USER_ACCOUNT_NULL.getResult());
		}
		
		if(StrUtil.isEmpty(password)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.PASSWORD_NULL.getResult());
		}
		
		String loginResult=userService.login(userAccount, password, session);
		
		//登录成功
		if(ServiceResultEnum.SUCCESS.getResult().equals(loginResult)) {
			return ResultGenerator.genSuccessResult();
		}
		
		return ResultGenerator.genFailResult(loginResult);
	}
	/*
	 * 退出登录
	 */
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:header";
	}
	
	/*
	 * 学生个人中心
	 */
	@GetMapping("/studentZone")
	public String getStudentZone(Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		model.addAttribute("student",userService.getStudent(userAccount));
		model.addAttribute("totalPosts",postMapper.getTotalPosts(userAccount));
		model.addAttribute("totalLikes",postMapper.getTotalLikes(userAccount));
		return "main/studentZone";
	}
	/*
	 * 个人中心修改密码界面
	 */
	@GetMapping("/editPassword")
	public String editPassword() {
		return "main/editPassword";
	}
	/*
	 * 修改密码成功页面
	 */
	@GetMapping("/editPwdSuccess")
	public String editPwdSuccess() {
		return "main/editPwdSuccess";
	}
	/*
	 * 我的申请
	 */
	@GetMapping("/myApply")
	public String getMyApply(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
							 @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
							 Model model,HttpSession session){
		User user=(User)session.getAttribute("user");
		model.addAttribute("applyList",userService.getApplyList(user, pageNumber, pageSize));
		return "main/myApply";
	}
	
	/*
	 * 修改密码
	 */
	@PostMapping("/changePwd")
	@ResponseBody
	public Result changePwd(@RequestParam("old_pwd")String oldPassword,
							@RequestParam("new_pwd")String newPassword,
							HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		String changeResult=userService.changePwd(userAccount, oldPassword, newPassword);
		//修改成功
		if(ServiceResultEnum.SUCCESS.getResult().equals(changeResult)) {
			user.setPassword(PasswordEncrypter.encrypt(newPassword));
			session.setAttribute("user",user);
			return ResultGenerator.genSuccessResult();
		}
		return ResultGenerator.genFailResult(changeResult);
	}
}
