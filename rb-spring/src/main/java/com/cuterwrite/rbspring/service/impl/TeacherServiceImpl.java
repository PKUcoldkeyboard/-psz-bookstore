package com.cuterwrite.rbspring.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.dao.TeacherMapper;
import com.cuterwrite.rbspring.entity.TeacherWithBLOBs;
import com.cuterwrite.rbspring.service.TeacherService;
import com.cuterwrite.rbspring.util.Page;
import com.github.pagehelper.PageHelper;


@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherMapper teacherMapper;
	
	@Override
	public Page<TeacherWithBLOBs> getList(String initial, Integer pageNumber, Integer pageSize) {
		Map<String, Object>where=new HashMap<>();
		if(initial!=null&&!initial.equals("")) {
			where.put("initial", initial);
		}
		//分页
		PageHelper.startPage(pageNumber,pageSize);
		List<TeacherWithBLOBs>teacherList=teacherMapper.selectByInitial(where);
		return Page.restPage(teacherList);
	}
	
}
