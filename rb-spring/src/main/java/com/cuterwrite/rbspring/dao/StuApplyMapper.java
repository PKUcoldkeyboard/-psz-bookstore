package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.StuApply;
import com.cuterwrite.rbspring.entity.StuApplyKey;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * StuApplyMapper继承基类
 */
@Repository
public interface StuApplyMapper extends MyBatisBaseDao<StuApply, StuApplyKey> {
	List<StuApply>selectByUserAccount(String userAccount);
	/*
	 * 获取未查看数
	 */
	int getUnread(String userAccount);
	
	int updateByUserAccount(String userAccount);
}