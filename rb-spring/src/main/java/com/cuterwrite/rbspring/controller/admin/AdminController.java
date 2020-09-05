package com.cuterwrite.rbspring.controller.admin;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.service.AdminService;
import com.cuterwrite.rbspring.util.ResultGenerator;

import cn.hutool.core.util.StrUtil;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	/*
	 * 首页
	 */
	@GetMapping("/index")
	public String getIndexPage() {
		return "admin/index";
	}
	
	/*
	 * 登录页面
	 */
	
	@GetMapping("/login")
	public String loginPage() {
		return "admin/register_login/login";
	}
	
	/*
	 * 登录接口
	 */
	@PostMapping("/login")
	@ResponseBody
	public Result login(@RequestParam("userAccount")String userAccount,@RequestParam("password")String password,
						HttpSession session) {
		if(StrUtil.isEmpty(userAccount)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.USER_ACCOUNT_NULL.getResult());
		}
		
		if(StrUtil.isEmpty(password)) {
			return ResultGenerator.genFailResult(ServiceResultEnum.PASSWORD_NULL.getResult());
		}
		String result=adminService.login(userAccount, password, session);
		//登录成功
		if(ServiceResultEnum.SUCCESS.getResult().equals(result)) {
			return ResultGenerator.genSuccessResult();
		}
		
		return ResultGenerator.genFailResult(result);
	}
	/*
	 * 意见反馈页
	 */
	@GetMapping("/adviceMail")
	public String getAdviceMail() {
		return "admin/advice_check/mail";
	}
}
