package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.TeApply;
import com.cuterwrite.rbspring.entity.TeApplyKey;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * TeApplyMapper继承基类
 */
@Repository
public interface TeApplyMapper extends MyBatisBaseDao<TeApply, TeApplyKey> {
	List<TeApply>selectByUserAccount(String userAccount);
	
	/*
	 * 获取未查看数
	 */
	int getUnread(String userAccount);
	
	int updateByUserAccount(String userAccount);
}