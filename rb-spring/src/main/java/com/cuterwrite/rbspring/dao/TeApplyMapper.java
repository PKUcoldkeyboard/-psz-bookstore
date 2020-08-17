package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.TeApply;
import com.cuterwrite.rbspring.entity.TeApplyKey;
import org.springframework.stereotype.Repository;

/**
 * TeApplyMapper继承基类
 */
@Repository
public interface TeApplyMapper extends MyBatisBaseDao<TeApply, TeApplyKey> {
}