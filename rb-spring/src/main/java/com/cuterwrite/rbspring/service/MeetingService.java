package com.cuterwrite.rbspring.service;

import com.cuterwrite.rbspring.entity.Conference;
import com.cuterwrite.rbspring.entity.PeriodicalCn;
import com.cuterwrite.rbspring.entity.PeriodicalFo;
import com.cuterwrite.rbspring.util.Page;

public interface MeetingService {
	/*
	 * 学术会议列表
	 */
	Page<Conference>getConference(Integer pageNumber,Integer pageSize);
	
	/*
	 * 外文期刊列表
	 */
	Page<PeriodicalFo>getPeriodicalFo(Integer pageNumber,Integer pageSize);
	
	/*
	 * 中文期刊列表
	 */
	Page<PeriodicalCn>getPeriodicalCn(Integer pageNumber,Integer pageSize);
}
