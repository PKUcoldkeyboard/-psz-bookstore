package com.cuterwrite.rbspring.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.cuterwrite.rbspring.entity.Article;

/*
  *  商品搜索
 * Created by cuterwrite on 2020/8/22
 */
public interface ElasticService {
	
	/*
	 * 从数据库中导入所有记录到ES
	 */
	int importAll();
	
	/*
	 * 创建一个索引
	 */
	Article create(int id);
	
	/*
	 * 根据id删除索引
	 */
	void delete(Long id);
	
	/*
	 * 批量删除
	 */
	void delete(List<Long>ids);
	
	/*
	 * 全删除
	 */
	void deleteAll();
	
	
	/*
	 * 根据关键词搜索内容、标题，并筛选排序。
	 */
	Page<Article>search(String keyword,List<String>filter,Integer pageNumber,Integer pageSize,Integer sort);
	
	
}
