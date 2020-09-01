package com.cuterwrite.rbspring.dao;

import com.cuterwrite.rbspring.entity.Post;

import java.util.List;
import java.util.Map;

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
	
	/*
	 * 条件select
	 */
	List<Post>selectByExample(Map<String, Object>map);
	
	/*
	 * 联合Collect表
	 */
	List<Post>selectWithCollect(Map<String, Object>map);
}