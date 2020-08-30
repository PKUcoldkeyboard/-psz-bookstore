package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Teacher;
import com.cuterwrite.rbspring.entity.TeacherWithBLOBs;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * TeacherMapper继承基类
 */
@Repository
public interface TeacherMapper extends MyBatisBaseDao<Teacher, String> {
	List<TeacherWithBLOBs>selectByInitial(Map<String, Object>map);
}