package com.cuterwrite.rbspring.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.dao.AdminMapper;
import com.cuterwrite.rbspring.entity.Admin;
import com.cuterwrite.rbspring.service.AdminService;
import com.cuterwrite.rbspring.util.PasswordEncrypter;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminMapper adminMapper;
	
	@Override
	public String login(String userAccount, String password,HttpSession session) {
		Admin admin=adminMapper.selectByPrimaryKey(userAccount);
		if(admin==null||!PasswordEncrypter.verify(password, admin.getPassword())) {
			return ServiceResultEnum.LOGIN_ERROR.getResult();
		}
		//登录成功
		session.setAttribute("admin", admin);
		return ServiceResultEnum.SUCCESS.getResult();
	}

}
