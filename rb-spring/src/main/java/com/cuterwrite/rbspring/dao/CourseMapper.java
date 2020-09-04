package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Course;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper extends MyBatisBaseDao<Course, String> {
	List<Course>selectByTeId(String teId);
}