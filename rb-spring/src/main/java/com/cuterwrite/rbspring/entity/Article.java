package com.cuterwrite.rbspring.entity;



import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
/**
 * 
 * @ClassName: Article
 * @Description: 索引文档类，用于构建ElasticSearch服务
 * @author psz
 * @date 2020-08-21 08:33:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Document(indexName = "rb-spring",shards = 1,replicas = 0,indexStoreType = "fs")
public class Article {
	
	@Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String title;//标题
	
	@Field(type = FieldType.Keyword)
    private String author;//发布者
	
	@Field(type = FieldType.Keyword)
    private String postTime;//发帖时间
	
	@Field(type = FieldType.Long)
	private Long time;//时间戳
	
	@Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String content;//正文
	
	@Field(type = FieldType.Double,index = false)
    private double popularity;//热度
	
	@Field(type = FieldType.Keyword)
    private String type;//内容类型
	
	@Field(type = FieldType.Keyword,index = false)
    private String id;//数据库id
	
	private String typeAsWord; //内容类型编号对应中文
	
	public void setTypeAsWord() {
		if(type.equals("101")||type.equals("102")||type.equals("103")
				||type.equals("111")||type.equals("112")||type.equals("113")) {
			typeAsWord="经验分享";
		}else if(type.equals("201")||type.equals("202")||type.equals("203")) {
			typeAsWord="期刊经验";
		}else {
			typeAsWord="公告通知";
		}
	}
}

