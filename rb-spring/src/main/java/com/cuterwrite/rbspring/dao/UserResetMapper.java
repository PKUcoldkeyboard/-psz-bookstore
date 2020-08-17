package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.UserReset;
import org.springframework.stereotype.Repository;

/**
 * UserResetMapper继承基类
 */
@Repository
public interface UserResetMapper extends MyBatisBaseDao<UserReset, String> {
}