package com.cuterwrite.rbspring.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.cuterwrite.rbspring.entity.Article;

public interface ElasticRepository extends ElasticsearchRepository<Article, Long>{
	
	Page<Article>findByContent(String content,Pageable pageable);
	
	Page<Article>findByTitle(String title,Pageable pageable);
	
	Page<Article>findByType(String type,Pageable pageable);
}
