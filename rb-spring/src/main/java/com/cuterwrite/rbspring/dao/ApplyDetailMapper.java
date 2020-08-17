package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.ApplyDetail;
import org.springframework.stereotype.Repository;

/**
 * ApplyDetailMapper继承基类
 */
@Repository
public interface ApplyDetailMapper extends MyBatisBaseDao<ApplyDetail, Integer> {
}