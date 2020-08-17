package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.TeacherDetail;
import org.springframework.stereotype.Repository;

/**
 * TeacherDetailMapper继承基类
 */
@Repository
public interface TeacherDetailMapper extends MyBatisBaseDao<TeacherDetail, String> {
}