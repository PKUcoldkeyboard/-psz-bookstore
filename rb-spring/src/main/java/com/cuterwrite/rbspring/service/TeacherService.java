package com.cuterwrite.rbspring.service;



import com.cuterwrite.rbspring.entity.TeacherWithBLOBs;
import com.cuterwrite.rbspring.util.Page;



public interface TeacherService {
	/*
	 * 获得导师信息列表
	 */
	Page<TeacherWithBLOBs>getList(String initial,Integer pageNumber,Integer pageSize);
}
