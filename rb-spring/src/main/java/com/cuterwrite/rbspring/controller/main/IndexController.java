package com.cuterwrite.rbspring.controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.dao.UserMapper;
import com.cuterwrite.rbspring.entity.User;

@Controller
public class IndexController {
	
	@Autowired
	UserMapper userMapper;
	
	@GetMapping({"/index","/","/index.html"})
	public String indexPage() {
		return "main/index";
	}
	@GetMapping("/user/{userAccount}")
	@ResponseBody
	public User getUser(@PathVariable("userAccount") String userAccount) {
		return userMapper.selectByPrimaryKey(userAccount);
	}
	
	@GetMapping("/header")
	public String headerPage() {
		return "main/header";
	}
}
