package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.UserUnverified;
import org.springframework.stereotype.Repository;

/**
 * UserUnverifiedMapper继承基类
 */
@Repository
public interface UserUnverifiedMapper extends MyBatisBaseDao<UserUnverified, String> {
}