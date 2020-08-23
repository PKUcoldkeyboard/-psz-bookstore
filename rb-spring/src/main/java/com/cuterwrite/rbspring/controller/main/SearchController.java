package com.cuterwrite.rbspring.controller.main;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuterwrite.rbspring.common.ServiceResultEnum;
import com.cuterwrite.rbspring.entity.Article;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.service.ElasticService;
import com.cuterwrite.rbspring.util.ResultGenerator;

@RestController
@RequestMapping("/elastic")
public class SearchController {
	
	@Autowired
	private ElasticService elasticService;
	
	/*
	 * 导入数据库中数据到ES
	 */
	@GetMapping("/importAll")
	@ResponseBody
	public Result<Integer>importAllList(){
		int count=elasticService.importAll();
		return ResultGenerator.genSuccessResult(count);
	}
	
	/*
	 * 根据id删除索引
	 */
	@GetMapping("/delete/{id}")
	@ResponseBody
	public Result<Object>delete(@PathVariable Long id){
		elasticService.delete(id);
		return ResultGenerator.genSuccessResult();
	}
	
	/*
	 * 批量删除
	 */
	@PostMapping("/delete/batch")
	@ResponseBody
	public Result<Object>delete(@RequestParam("ids") List<Long>ids){
		elasticService.delete(ids);
		return ResultGenerator.genSuccessResult();
	}
	
	/*
	 * 全删除
	 */
	@GetMapping("/deleteAll")
	@ResponseBody
	public Result<Object>deleteAll(){
		elasticService.deleteAll();
		return ResultGenerator.genSuccessResult();
	}
	
	/*
	 * 根据id创建一个索引
	 */
	@GetMapping("/create/{id}")
	@ResponseBody
	public Result<Article>create(@PathVariable int id){
		Article article=elasticService.create(id);
		return article==null?ResultGenerator.genFailResult(ServiceResultEnum.DATA_NOT_EXISTS.getResult()):ResultGenerator.genSuccessResult(article);
	}
	
	/*
	 * 检索、筛选并排序
	 */
	@GetMapping("/search")
	@ResponseBody
	public Result<Page<Article>>search(@RequestParam(name = "keyword",required = false)String keyword,
									   @RequestParam(name = "filters" ,required = false)List<String>filters,
									   @RequestParam(name = "pageNumber",required = false,defaultValue = "0")Integer pageNumber,
									   @RequestParam(name = "pageSize",required = false,defaultValue = "10")Integer pageSize,
									   @RequestParam(name = "sort" ,required = false,defaultValue = "0")Integer sort,
									   HttpServletRequest request){
		Page<Article>articlePage=elasticService.search(keyword, filters,pageNumber,pageSize,sort);
		return ResultGenerator.genSuccessResult(articlePage);
	}
	
}
