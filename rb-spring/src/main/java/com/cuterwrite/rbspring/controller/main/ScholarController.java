package com.cuterwrite.rbspring.controller.main;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.dao.CollectMapper;
import com.cuterwrite.rbspring.dao.LikeMapper;
import com.cuterwrite.rbspring.entity.Article;
import com.cuterwrite.rbspring.entity.Collect;
import com.cuterwrite.rbspring.entity.Like;
import com.cuterwrite.rbspring.entity.Result;
import com.cuterwrite.rbspring.entity.User;
import com.cuterwrite.rbspring.service.ElasticService;
import com.cuterwrite.rbspring.service.UserService;
import com.cuterwrite.rbspring.util.ResultGenerator;


@Controller
public class ScholarController {
	
	@Autowired
	ElasticService elasticService;

	@Autowired
	UserService userService;
	
	@Autowired
	LikeMapper likeMapper;
	
	@Autowired
	CollectMapper collectMapper;
	/*
	 * 学术研讨中心页面渲染
	 */
	@GetMapping("/scholarZone")
	public String scholarZonePage(Model model,HttpSession session) {
		Page<Article>articlePage=elasticService.search("", null, 0, 10, 1);
		model.addAttribute("articles",articlePage);
		
		Map<String, Boolean>isLike=new HashMap<>();
		Map<String,Boolean>isCollect=new HashMap<>();
		List<Article>articles=articlePage.getContent();
		User user=(User)session.getAttribute("user");
		
		if(user!=null) {
			for(Article article:articles) {
				String str=article.getId();
				int id=Integer.parseInt(str);
				Map<String,Object>map=new HashMap<>();
				map.put("userAccount", user.getUserAccount());
				map.put("postId", id);
				Like like=likeMapper.selectByAccountAndPostId(map);
				Collect collect=collectMapper.selectByAccountAndPostId(map);
				if(like!=null) {
					isLike.put(str, true);
				}else {
					isLike.put(str, false);
				}
				if(collect!=null) {
					isCollect.put(str, true);
				}else {
					isCollect.put(str, false);
				}
			}
		}else {
			for(Article article:articles) {
				String str=article.getId();
				isLike.put(str, false);
				isCollect.put(str, false);
			}
		}
		model.addAttribute("isLike",isLike);
		model.addAttribute("isCollect",isCollect);
		return "main/scholarZone";
	}
	
	/*
	 * 点赞
	 */
	@GetMapping("/praise")
	@ResponseBody
	public Result<Object>praise(@RequestParam(name = "userAccount")String userAccount,
								@RequestParam(name = "postId") Integer postId){
		return ResultGenerator.genSuccessResult(userService.like(userAccount, postId));
	}
	
	/*
	 * 收藏
	 */
	@GetMapping("/collect")
	@ResponseBody
	public Result<Object>collect(@RequestParam(name = "userAccount")String userAccount,
								@RequestParam(name = "postId") Integer postId){
		return ResultGenerator.genSuccessResult(userService.collect(userAccount, postId));
	}
}
