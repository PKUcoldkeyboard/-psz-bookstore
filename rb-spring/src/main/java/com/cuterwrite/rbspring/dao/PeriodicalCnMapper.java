package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.PeriodicalCn;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * PeriodicalCnMapper继承基类
 */
@Repository
public interface PeriodicalCnMapper extends MyBatisBaseDao<PeriodicalCn, Integer> {
	List<PeriodicalCn>selectAll();
}