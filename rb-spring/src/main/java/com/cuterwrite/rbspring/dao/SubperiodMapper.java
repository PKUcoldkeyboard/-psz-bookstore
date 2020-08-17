package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Subperiod;
import org.springframework.stereotype.Repository;

/**
 * SubperiodMapper继承基类
 */
@Repository
public interface SubperiodMapper extends MyBatisBaseDao<Subperiod, Integer> {
}