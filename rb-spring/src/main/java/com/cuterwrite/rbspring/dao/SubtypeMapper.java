package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Subtype;
import org.springframework.stereotype.Repository;

/**
 * SubtypeMapper继承基类
 */
@Repository
public interface SubtypeMapper extends MyBatisBaseDao<Subtype, Integer> {
}