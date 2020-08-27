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
	
	/*
	 * 用户点赞
	 */
	String like(String userAccount,int postId);
	
	/*
	 * 用户收藏
	 */
	String collect(String userAccount,int postId);
}
