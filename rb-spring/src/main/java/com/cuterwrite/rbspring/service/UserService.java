package com.cuterwrite.rbspring.service;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.cuterwrite.rbspring.entity.Apply;
import com.cuterwrite.rbspring.entity.Post;
import com.cuterwrite.rbspring.entity.PostExtra;
import com.cuterwrite.rbspring.entity.StuApply;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.TeApply;
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
	
	/*
	 * 获取我的帖子列表
	 */
	Page<Post>getPostList(Map<String, Object> map,Integer pageNumber,Integer pageSize);
	
	/*
	 * 获取我的收藏列表
	 */
	Page<Post>getCollectList(Map<String, Object> map,Integer pageNumber,Integer pageSize);
	
	/*
	 * 获取学生申请列表
	 */
	Page<StuApply>getStuApply(String userAccount,Integer pageNumber,Integer pageSize);
	
	/*
	 * 获取老师申请列表
	 */
	Page<TeApply>getTeApply(String userAccount,Integer pageNumber,Integer pageSize);
	
	/*
	 * 获取与申请有关的消息和系统通知
	 */
	Page<PostExtra>getPostAndNotice(String userAccount,Integer pageNumber,Integer pageSize);
	
}
