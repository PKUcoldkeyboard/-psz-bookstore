package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Like;
import org.springframework.stereotype.Repository;

/**
 * LikeMapper继承基类
 */
@Repository
public interface LikeMapper extends MyBatisBaseDao<Like, Integer> {
}