package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Apply;
import org.springframework.stereotype.Repository;

/**
 * ApplyMapper继承基类
 */
@Repository
public interface ApplyMapper extends MyBatisBaseDao<Apply, Integer> {
}