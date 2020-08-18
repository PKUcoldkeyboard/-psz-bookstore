package com.cuterwrite.rbspring.service;

import javax.servlet.http.HttpSession;

import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.User;

public interface UserService {
	
	/*
	 * 用户注册
	 */
	String register(User user, Student student);
	
	/*
	 * 用户登录
	 */
	String login(String userAccount,String password,HttpSession session);
}
