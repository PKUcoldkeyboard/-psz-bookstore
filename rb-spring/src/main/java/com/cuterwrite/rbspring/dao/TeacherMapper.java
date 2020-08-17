package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Teacher;
import org.springframework.stereotype.Repository;

/**
 * TeacherMapper继承基类
 */
@Repository
public interface TeacherMapper extends MyBatisBaseDao<Teacher, String> {
}