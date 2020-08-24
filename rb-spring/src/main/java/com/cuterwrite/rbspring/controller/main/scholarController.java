package com.cuterwrite.rbspring.controller.main;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cuterwrite.rbspring.service.ElasticService;


@Controller
public class scholarController {
	
	@Autowired
	ElasticService elasticService;
	/*
	 * 学术研讨中心
	 */
	@GetMapping("/scholarZone")
	public String scholarZonePage(Model model) {
		model.addAttribute("articles",elasticService.search("", null, 0, 10, 1));
		return "main/scholarZone";
	}
}
