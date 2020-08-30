package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.PeriodicalFo;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * PeriodicalFoMapper继承基类
 */
@Repository
public interface PeriodicalFoMapper extends MyBatisBaseDao<PeriodicalFo, Integer> {
	List<PeriodicalFo>selectAll();
}