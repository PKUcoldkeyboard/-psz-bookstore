package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Course;
import org.springframework.stereotype.Repository;

/**
 * CourseMapper继承基类
 */
@Repository
public interface CourseMapper extends MyBatisBaseDao<Course, String> {
}