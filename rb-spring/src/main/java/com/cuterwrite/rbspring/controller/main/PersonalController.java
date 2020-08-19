package com.cuterwrite.rbspring.controller.main;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.service.UserService;
import com.cuterwrite.rbspring.util.PasswordEncrypter;
import com.cuterwrite.rbspring.util.ResultGenerator;

import cn.hutool.core.util.StrUtil;

@Controller
public class PersonalController {
	
	@Resource
	private UserService userService;
	
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
}
