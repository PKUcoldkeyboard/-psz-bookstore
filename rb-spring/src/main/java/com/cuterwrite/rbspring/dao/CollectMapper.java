package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Collect;
import org.springframework.stereotype.Repository;

/**
 * CollectMapper继承基类
 */
@Repository
public interface CollectMapper extends MyBatisBaseDao<Collect, Integer> {
}