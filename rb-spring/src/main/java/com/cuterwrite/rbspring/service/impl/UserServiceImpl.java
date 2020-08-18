package com.cuterwrite.rbspring.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.dao.StudentMapper;
import com.cuterwrite.rbspring.dao.UserMapper;
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
	
}
