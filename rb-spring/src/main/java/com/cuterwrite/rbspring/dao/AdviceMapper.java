package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Advice;
import org.springframework.stereotype.Repository;

/**
 * AdviceMapper继承基类
 */
@Repository
public interface AdviceMapper extends MyBatisBaseDao<Advice, Integer> {
}