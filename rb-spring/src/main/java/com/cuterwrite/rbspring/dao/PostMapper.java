package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Post;
import org.springframework.stereotype.Repository;

/**
 * PostMapper继承基类
 */
@Repository
public interface PostMapper extends MyBatisBaseDao<Post, Integer> {
	/*
	 * 获取发帖数
	 */
	int getTotalPosts(String userAccount);
	
	/*
	 * 获取获赞数
	 */
	int getTotalLikes(String userAccount);
}