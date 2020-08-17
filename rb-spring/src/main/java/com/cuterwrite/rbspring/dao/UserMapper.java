package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.User;
import org.springframework.stereotype.Repository;

/**
 * UserMapper继承基类
 */
@Repository
public interface UserMapper extends MyBatisBaseDao<User, String> {
}