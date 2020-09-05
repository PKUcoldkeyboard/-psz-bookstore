package com.cuterwrite.rbspring.service;

import javax.servlet.http.HttpSession;

public interface AdminService {
	/*
	 * 登录
	 */
	String login(String userAccount,String password,HttpSession session);
}
