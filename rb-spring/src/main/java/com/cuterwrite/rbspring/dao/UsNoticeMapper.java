package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.PostExtra;
import com.cuterwrite.rbspring.entity.UsNotice;
import com.cuterwrite.rbspring.entity.UsNoticeKey;

import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * UsNoticeMapper继承基类
 */
@Repository
public interface UsNoticeMapper extends MyBatisBaseDao<UsNotice, UsNoticeKey> {
	List<PostExtra>selectByUserAccount(String userAccount);
	
	/*
	 * 获取未查看数
	 */
	int getUnread(String userAccount);
	
	int updateByUserAccount(String userAccount);
}