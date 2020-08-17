package com.cuterwrite.rbspring.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"/index","/","/index.html"})
	public String indexPage() {
		return "mall/index";
	}
}
