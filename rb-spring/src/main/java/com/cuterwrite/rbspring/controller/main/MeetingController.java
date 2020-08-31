package com.cuterwrite.rbspring.controller.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cuterwrite.rbspring.entity.Conference;
import com.cuterwrite.rbspring.entity.PeriodicalCn;
import com.cuterwrite.rbspring.entity.PeriodicalFo;
import com.cuterwrite.rbspring.service.MeetingService;
import com.cuterwrite.rbspring.util.Page;

@Controller
public class MeetingController {
	
	@Autowired
	MeetingService meetingService;
	
	@GetMapping("/academicMeeting")
	public String getAcademicPage(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
								  @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
								  Model model) {
		Page<Conference>conferences=meetingService.getConference(pageNumber, pageSize);
		model.addAttribute("conferences",conferences);
		return "main/academicMeeting";
	}
	
	@GetMapping("/worldMeeting")
	public String getWorldMeeting(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
			  					  @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
			  					  Model model) {
		Page<PeriodicalFo>periodicalFos=meetingService.getPeriodicalFo(pageNumber, pageSize);
		model.addAttribute("periodicalFos",periodicalFos);
		return "main/worldMeeting";
	}
	
	@GetMapping("/chineseMeeting")
	public String getChinesMeeting(@RequestParam(name="pageNumber",required = false,defaultValue = "1")Integer pageNumber,
								   @RequestParam(name="pageSize",required = false,defaultValue = "5")Integer pageSize,
								   Model model) {
		Page<PeriodicalCn>periodicalCns=meetingService.getPeriodicalCn(pageNumber, pageSize);
		model.addAttribute("periodicalCns",periodicalCns);
		return "main/chineseMeeting";
	}
	
	@GetMapping("/academic")
	@ResponseBody
	public Page<Conference>getAcademic(){
		return meetingService.getConference(1, 10);
	}
}
