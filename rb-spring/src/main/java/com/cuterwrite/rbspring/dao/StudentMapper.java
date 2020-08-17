package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Student;
import org.springframework.stereotype.Repository;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseDao<Student, String> {
}