package com.cuterwrite.rbspring.service.impl;


import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import org.elasticsearch.common.lucene.search.function.FunctionScoreQuery;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.dao.ElasticRepository;
import com.cuterwrite.rbspring.dao.PostMapper;
import com.cuterwrite.rbspring.entity.Article;
import com.cuterwrite.rbspring.entity.Post;
import com.cuterwrite.rbspring.service.ElasticService;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;

@Service
public class ElasticServiceImpl implements ElasticService{
	
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private ElasticsearchRestTemplate elasticsearchRestTemplate;
	@Autowired
	private ElasticRepository elasticRepository;
	
	@Override
	public int importAll() {
		List<Article>articles=new ArrayList<>();
		for(int i=1;i<24;i++) {
			Post post=postMapper.selectByPrimaryKey(i);
			Article article=new Article();
			article=article.setAuthor(post.getPostAuthor()).setContent(post.getPostContent())
					.setId(post.getPostId().toString())
					.setPostTime(DateUtil.formatDateTime(post.getPostDate()))
					.setTitle(post.getPostTitle())
					.setType(post.getPostType())
					.setPopularity(post.getPostCollectNum()*2+post.getPostLikeNum()*1);
			Date date=post.getPostDate();
			Long datetime=date.getTime();
			article=article.setTime(datetime);		
			articles.add(article);
		}
		Iterable<Article>articleIterable=elasticRepository.saveAll(articles);
		Iterator<Article>iterator=articleIterable.iterator();
		int result=0;
		while(iterator.hasNext()) {
			result++;
			iterator.next();
		}
		return result;
	}
	
	@Override
	public Article create(int id) {
		Article article=new Article();
		Post post=postMapper.selectByPrimaryKey(id);
		article=article.setAuthor(post.getPostAuthor()).setContent(post.getPostContent())
				.setPostTime(DateUtil.formatDateTime(post.getPostDate()))
				.setId(post.getPostId().toString())
				.setTitle(post.getPostTitle())
				.setType(post.getPostType())
				.setPopularity(post.getPostCollectNum()*2+post.getPostLikeNum()*1);
		Date date=post.getPostDate();
		Long datetime=date.getTime();
		article=article.setTime(datetime);	
		return elasticRepository.save(article);
	}
	
	@Override
	public void delete(Long id) {
		elasticRepository.deleteById(id);
	}

	@Override
	public void delete(List<Long> ids) {
		if(!CollUtil.isEmpty(ids)) {
			List<Article>articles=new ArrayList<>();
			for(Long id:ids) {
				Article article=new Article();
				article.setId(id.toString());
				articles.add(article);
			}
			elasticRepository.deleteAll(articles);
		}
	}
	
	@Override
	public void deleteAll() {
		elasticRepository.deleteAll();
	}

	@Override
	public Page<Article> search(String keyword, List<String>filters, Integer pageNumber,Integer pageSize,Integer sort) {
		NativeSearchQueryBuilder nativeSearchQueryBuilder=new NativeSearchQueryBuilder();
		Pageable pageable=PageRequest.of(pageNumber, pageSize);
		//分页
		nativeSearchQueryBuilder.withPageable(pageable);
		//筛选
		if(filters!=null) {
			BoolQueryBuilder boolQueryBuilder=QueryBuilders.boolQuery();
			boolQueryBuilder.must(QueryBuilders.termsQuery("type", filters));
			nativeSearchQueryBuilder.withFilter(boolQueryBuilder);
		}
		//排序
		if(sort==1) {
			//按时间降序
			nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("time").order(SortOrder.DESC));
		}else if(sort==2) {
			//按时间升序
			nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("time").order(SortOrder.ASC));
		}else if(sort==3) {
			//按热度降序
			nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("popularity").order(SortOrder.DESC));
		}else if(sort==4) {
			//按热度升序
			nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("popularity").order(SortOrder.ASC));
		}else {
			//按相关度降序
			nativeSearchQueryBuilder.withSort(SortBuilders.scoreSort().order(SortOrder.DESC));
		}
		
		//搜索
		if(StrUtil.isEmpty(keyword)) {
			nativeSearchQueryBuilder.withQuery(QueryBuilders.matchAllQuery());
			nativeSearchQueryBuilder.withSort(SortBuilders.fieldSort("time").order(SortOrder.DESC));
		}else {
			List<FunctionScoreQueryBuilder.FilterFunctionBuilder>filterFunctionBuilders=new ArrayList<>();
			filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(QueryBuilders.matchQuery("title",keyword),
					ScoreFunctionBuilders.weightFactorFunction(10)));
			filterFunctionBuilders.add(new FunctionScoreQueryBuilder.FilterFunctionBuilder(QueryBuilders.matchQuery("content",keyword),
					ScoreFunctionBuilders.weightFactorFunction(2)));
			FunctionScoreQueryBuilder.FilterFunctionBuilder[]builders=new FunctionScoreQueryBuilder.FilterFunctionBuilder[filterFunctionBuilders.size()];
			
			filterFunctionBuilders.toArray(builders);
			
			FunctionScoreQueryBuilder functionScoreQueryBuilder=QueryBuilders.functionScoreQuery(builders)
					.scoreMode(FunctionScoreQuery.ScoreMode.SUM)
					.setMinScore(2);
			
			nativeSearchQueryBuilder.withQuery(functionScoreQueryBuilder);
		}
		
		NativeSearchQuery searchQuery=nativeSearchQueryBuilder.build();
	    SearchHits<Article>searchHits=elasticsearchRestTemplate.search(searchQuery, Article.class);
		if(searchHits.getTotalHits()<=0) {
			return new PageImpl<>(null,pageable,0);
		}
		List<Article>searchArticleList=searchHits.stream().map(SearchHit::getContent).collect(Collectors.toList());
		searchArticleList.forEach(a->a.setTypeAsWord());
		return new PageImpl<>(searchArticleList,pageable,searchHits.getTotalHits());
	}
	
}
