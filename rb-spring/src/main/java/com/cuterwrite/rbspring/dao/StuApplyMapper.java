package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.StuApply;
import com.cuterwrite.rbspring.entity.StuApplyKey;
import org.springframework.stereotype.Repository;

/**
 * StuApplyMapper继承基类
 */
@Repository
public interface StuApplyMapper extends MyBatisBaseDao<StuApply, StuApplyKey> {
}