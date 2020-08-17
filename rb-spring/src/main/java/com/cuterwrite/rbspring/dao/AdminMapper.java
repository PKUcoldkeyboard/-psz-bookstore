package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Admin;
import org.springframework.stereotype.Repository;

/**
 * AdminMapper继承基类
 */
@Repository
public interface AdminMapper extends MyBatisBaseDao<Admin, String> {
}