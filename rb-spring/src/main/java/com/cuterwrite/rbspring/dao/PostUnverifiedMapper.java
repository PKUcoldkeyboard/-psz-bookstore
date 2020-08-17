package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.PostUnverified;
import org.springframework.stereotype.Repository;

/**
 * PostUnverifiedMapper继承基类
 */
@Repository
public interface PostUnverifiedMapper extends MyBatisBaseDao<PostUnverified, Integer> {
}