package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Conference;
import org.springframework.stereotype.Repository;

/**
 * ConferenceMapper继承基类
 */
@Repository
public interface ConferenceMapper extends MyBatisBaseDao<Conference, Integer> {
}