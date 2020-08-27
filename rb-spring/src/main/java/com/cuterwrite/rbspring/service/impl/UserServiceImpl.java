package com.cuterwrite.rbspring.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.dao.CollectMapper;
import com.cuterwrite.rbspring.dao.LikeMapper;
import com.cuterwrite.rbspring.dao.PostMapper;
import com.cuterwrite.rbspring.dao.StudentMapper;
import com.cuterwrite.rbspring.dao.UserMapper;
import com.cuterwrite.rbspring.entity.Collect;
import com.cuterwrite.rbspring.entity.Like;
import com.cuterwrite.rbspring.entity.Post;
import com.cuterwrite.rbspring.entity.Student;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.service.UserService;
import com.cuterwrite.rbspring.util.PasswordEncrypter;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	LikeMapper likeMapper;
	
	@Autowired
	CollectMapper collectMapper;
	
	@Autowired
	PostMapper postMapper;
	
	@Override
	public String register(User user,Student student) {
		//用户已存在
		if(userMapper.selectByPrimaryKey(user.getUserAccount())!=null) {
			return ServiceResultEnum.SAMA_USER_ACCOUNT_EXISTS.getResult();
		}
		//注册成功
		if(userMapper.insertSelective(user)>0&&studentMapper.insertSelective(student)>0) {
			return ServiceResultEnum.SUCCESS.getResult();
		}
		return ServiceResultEnum.DB_ERROR.getResult();
	}

	@Override
	public String login(String userAccount, String password,HttpSession session) {
		User user=userMapper.selectByPrimaryKey(userAccount);
		if(user==null||!PasswordEncrypter.verify(password, user.getPassword())) {
			return ServiceResultEnum.LOGIN_ERROR.getResult();
		}
		//登录成功
		session.setAttribute("user", user);
		return ServiceResultEnum.SUCCESS.getResult();
	}

	@Override
	public String like(String userAccount, int postId) {		
		Map<String, Object>map=new HashMap<>();
		map.put("userAccount", userAccount);
		map.put("postId", postId);
		Like like=likeMapper.selectByAccountAndPostId(map);
		//点赞不存在，执行插入和更新，反之执行删除和更新
		if(like==null) {
			Post post=postMapper.selectByPrimaryKey(postId);
			post.setPostLikeNum(post.getPostLikeNum()+1);
			postMapper.updateByPrimaryKeySelective(post);
			Like record=new Like();
			record.setUserAccount(userAccount);
			record.setPostId(postId);
			likeMapper.insertSelective(record);		
			return "点赞成功";
		}else {
			Post post=postMapper.selectByPrimaryKey(postId);
			post.setPostLikeNum(post.getPostLikeNum()-1);
			postMapper.updateByPrimaryKeySelective(post);
			likeMapper.deleteByPrimaryKey(like.getLikeId());
			return "取消点赞";
		}
		
	}

	@Override
	public String collect(String userAccount, int postId) {
		Map<String, Object>map=new HashMap<>();
		map.put("userAccount", userAccount);
		map.put("postId", postId);
		Collect collect=collectMapper.selectByAccountAndPostId(map);
		//点赞不存在，执行插入和更新，反之执行删除和更新
		if(collect==null) {
			Post post=postMapper.selectByPrimaryKey(postId);
			post.setPostCollectNum(post.getPostCollectNum()+1);
			postMapper.updateByPrimaryKeySelective(post);
			Collect record=new Collect();
			record.setUserAccount(userAccount);
			record.setPostId(postId);
			collectMapper.insertSelective(record);		
			return "收藏成功";
		}else {
			Post post=postMapper.selectByPrimaryKey(postId);
			post.setPostCollectNum(post.getPostCollectNum()-1);
			postMapper.updateByPrimaryKeySelective(post);
			collectMapper.deleteByPrimaryKey(collect.getCollectId());
			return "取消收藏";
		}
	}
	
}
