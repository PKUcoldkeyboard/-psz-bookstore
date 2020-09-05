package com.cuterwrite.rbspring.controller.main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.dao.CourseMapper;
import com.cuterwrite.rbspring.dao.PostMapper;
import com.cuterwrite.rbspring.dao.StuApplyMapper;
import com.cuterwrite.rbspring.dao.StudentMapper;
import com.cuterwrite.rbspring.dao.TeApplyMapper;
import com.cuterwrite.rbspring.dao.TeQuotaMapper;
import com.cuterwrite.rbspring.dao.TeacherDetailMapper;
import com.cuterwrite.rbspring.dao.TeacherMapper;
import com.cuterwrite.rbspring.dao.UsNoticeMapper;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.TeQuota;
import com.cuterwrite.rbspring.entity.TeacherDetailWithBLOBs;
import com.cuterwrite.rbspring.entity.TeacherWithBLOBs;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.service.UserService;
import com.cuterwrite.rbspring.util.PasswordEncrypter;
import com.cuterwrite.rbspring.util.ResultGenerator;

import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;

@Controller
public class PersonalController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PostMapper postMapper;
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Autowired
	private StuApplyMapper stuApplyMapper;
	
	@Autowired
	private TeApplyMapper teApplyMapper;
	
	@Autowired
	private UsNoticeMapper usNoticeMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;
	
	@Autowired
	private TeacherDetailMapper teacherDetailMapper;
	
	@Autowired
	private TeQuotaMapper teQuotaMapper;
	
	@Autowired
	private CourseMapper courseMapper;
	
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
		return "redirect:index";
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
	 * 老师个人中心
	 */
	@GetMapping("/teacherZone")
	public String getTeacherZone(Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		model.addAttribute("teacher",teacherMapper.selectByPrimaryKey(userAccount));
		model.addAttribute("teDetail",teacherDetailMapper.selectByPrimaryKey(userAccount));
		model.addAttribute("teQuotaList",teQuotaMapper.selectByTeId(userAccount));
		model.addAttribute("courses",courseMapper.selectByTeId(userAccount));
		model.addAttribute("totalPosts",postMapper.getTotalPosts(userAccount));
		model.addAttribute("totalLikes",postMapper.getTotalLikes(userAccount));
		return "main/teacherZone";
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
	 * 我的帖子
	 */
	@GetMapping("/myPost")
	public String getMyPost(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
							@RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
							@RequestParam(name="rank",required = false,defaultValue = "hot")String rank,
							Model model,HttpSession session){
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		Map<String, Object>map=new HashMap<>();
		map.put("userAccount", userAccount);
		map.put("rank", rank);
		model.addAttribute("posts",userService.getPostList(map, pageNumber, pageSize));
		model.addAttribute("rank",rank);
		return "main/Mypost";
	}
	
	/*
	 * 我的收藏
	 */
	@GetMapping("/myCollect")
	public String getMyCollect(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
							   @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
							   @RequestParam(name="rank",required = false,defaultValue = "hot")String rank,
							   Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		Map<String, Object>map=new HashMap<>();
		map.put("userAccount", userAccount);
		map.put("rank", rank);
		model.addAttribute("posts",userService.getCollectList(map, pageNumber, pageSize));
		model.addAttribute("rank",rank);
		return "main/MyCollect";
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
	
	/*
	 * 学生修改资料
	 */
	@GetMapping("/studentEditInfo")
	public String getStudentEditInfo(Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		model.addAttribute("student",studentMapper.selectByPrimaryKey(userAccount));
		return "main/studentEditInfo";
	}
	
	/*
	 * 老师修改资料
	 */
	@GetMapping("/teacherEditInfo")
	public String getTeacherEditInfo(Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		model.addAttribute("teacher",teacherMapper.selectByPrimaryKey(userAccount));
		model.addAttribute("teDetail",teacherDetailMapper.selectByPrimaryKey(userAccount));
		model.addAttribute("teQuotaList",teQuotaMapper.selectByTeId(userAccount));
		model.addAttribute("courses",courseMapper.selectByTeId(userAccount));
		model.addAttribute("totalPosts",postMapper.getTotalPosts(userAccount));
		model.addAttribute("totalLikes",postMapper.getTotalLikes(userAccount));
		return "main/teacherEditInfo";
	}
	
	/*
	 * 修改基本信息
	 */
	@PostMapping("/editStudent")
	@ResponseBody
	public Result editStudent(@RequestParam(name = "gender")String gender,
							  @RequestParam(name = "grade")String grade,
							  @RequestParam(name = "major")String major,
							  HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		Student student=studentMapper.selectByPrimaryKey(userAccount);
		student.setStuGender(gender);
		student.setStuGrade(grade);
		student.setStuMajor(major);
		studentMapper.updateByPrimaryKeySelective(student);
		return ResultGenerator.genSuccessResult();
	}
	
	/*
	 * 修改老师资料
	 */
	@PostMapping("/editTeacher")
	@ResponseBody
	public Result editTeacher(@RequestParam("teacher")String teacher,
							  @RequestParam("teacher_detail")String teDetail,
							  @RequestParam("te_quota")String teQuota,
							  HttpSession session) {
		String userAccount=((User)session.getAttribute("user")).getUserAccount();
		TeacherWithBLOBs record1=JSONUtil.toBean(teacher,TeacherWithBLOBs.class);
		TeacherDetailWithBLOBs record2=JSONUtil.toBean(teDetail, TeacherDetailWithBLOBs.class);
		List<TeQuota>quotaList=JSONUtil.parseArray(teQuota).toList(TeQuota.class);
		record1.setTeId(userAccount);
		record2.setTeId(userAccount);
		teacherMapper.updateByPrimaryKeySelective(record1);
		teacherDetailMapper.updateByPrimaryKeySelective(record2);
		
		for(TeQuota q:quotaList) {
			q.setTeId(userAccount);
			teQuotaMapper.updateByPrimaryKeySelective(q);
		}
		
		
		return ResultGenerator.genSuccessResult();
	}
	
	/*
	 * 更换头像页面
	 */
	@GetMapping("/uploadAvatar")
	public String uploadAvatar() {
		return "main/uploadAvatar";
	}
	
	/*
	 * 上传头像
	 */
	@PostMapping("/uploadAvatar")
	@ResponseBody
	public Result handleAvatarUpload(@RequestParam(name = "imgData")String dataURL,
									HttpSession session) throws IOException{
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		String imgName=userAccount+".jpg";
		String path=System.getProperty("user.dir")+"/src/main/resources/static/main/image/avatar/"+imgName;
		String base64=dataURL.substring(dataURL.indexOf(",")+1);
		FileOutputStream write=new FileOutputStream(new File(path));
		byte[]decoderBytes=Base64.decode(base64);
		write.write(decoderBytes);
		write.close();
		return ResultGenerator.genSuccessResult();
	}
	/*
	 * 收件箱页面
	 */
	@GetMapping("/mailBox")
	public String getMailBox(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
			   				 @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
			   				 @RequestParam(name="module",required = false,defaultValue = "1")Integer module,
			   				 Model model,HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		model.addAttribute("stuApplyList",userService.getStuApply(userAccount, pageNumber, pageSize));
		model.addAttribute("teApplyList",userService.getTeApply(userAccount, pageNumber, pageSize));
		model.addAttribute("noticeList",userService.getPostAndNotice(userAccount, pageNumber, pageSize));
		model.addAttribute("module",module);
		
		String userType=user.getUserType();
		if(userType.equals("学生")) {
			model.addAttribute("unreadApply",stuApplyMapper.getUnread(userAccount));
		}else {
			model.addAttribute("unreadApply",teApplyMapper.getUnread(userAccount));
		}
		model.addAttribute("unreadNotice",usNoticeMapper.getUnread(userAccount));
		return "main/mailBox";
	}
	
	@PostMapping("/setRead")
	@ResponseBody
	public Result setRead(HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		String userType=user.getUserType();
		if(userType.equals("学生")) {
			stuApplyMapper.updateByUserAccount(userAccount);
		}else {
			teApplyMapper.updateByUserAccount(userAccount);
		}
		return ResultGenerator.genSuccessResult();
	}
	
	@PostMapping("/setNoticesRead")
	@ResponseBody
	public Result setNoticesRead(HttpSession session) {
		User user=(User)session.getAttribute("user");
		String userAccount=user.getUserAccount();
		usNoticeMapper.updateByUserAccount(userAccount);
		return ResultGenerator.genSuccessResult();
	}
}
