package com.cuterwrite.rbspring.controller.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.entity.TeacherWithBLOBs;
import com.cuterwrite.rbspring.service.TeacherService;
import com.cuterwrite.rbspring.util.Page;

@Controller
public class TeacherController {
	@Autowired
	TeacherService teacherService;
	
	@GetMapping("/teacherList")
	public String getTeacherPage(@RequestParam(name="initial",required = false)String initial,
								 @RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
								 @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
								 Model model) {
		Page<TeacherWithBLOBs>teacherList=teacherService.getList(initial,pageNumber,pageSize);
		List<Character>letter=new ArrayList<>();
		for(int i=0;i<26;i++) {
			char temp=(char) ('A'+i);
			letter.add(temp);
		}
		model.addAttribute("teacherList",teacherList);
		model.addAttribute("letter",letter);
		model.addAttribute("initial",initial);	
		return "main/teacherList";
	}
	@GetMapping("/teacher")
	@ResponseBody
	public Page<TeacherWithBLOBs> getTeacher(Model model) {
		Page<TeacherWithBLOBs>teacherList=teacherService.getList("A", 1 ,3);
		return teacherList;
	}
}
