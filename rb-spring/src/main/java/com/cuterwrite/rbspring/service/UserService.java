package com.cuterwrite.rbspring.service;

import javax.servlet.http.HttpSession;

import com.cuterwrite.rbspring.entity.Apply;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.util.Page;

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
	 * 修改密码
	 */
	String changePwd(String userAccount,String oldPassword,String newPassword);
	
	/*
	 * 用户点赞
	 */
	String like(String userAccount,int postId);
	
	/*
	 * 用户收藏
	 */
	String collect(String userAccount,int postId);
	
	/*
	 * 获取单个学生信息
	 */
	Student getStudent(String userAccount);
	
	/*
	 * 获取申请列表
	 */
	Page<Apply>getApplyList(User user,Integer pageNumber,Integer pageSize);
}
