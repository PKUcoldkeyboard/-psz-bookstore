package com.cuterwrite.rbspring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cuterwrite.rbspring.dao.ConferenceMapper;
import com.cuterwrite.rbspring.dao.PeriodicalCnMapper;
import com.cuterwrite.rbspring.dao.PeriodicalFoMapper;
import com.cuterwrite.rbspring.entity.Conference;
import com.cuterwrite.rbspring.entity.PeriodicalCn;
import com.cuterwrite.rbspring.entity.PeriodicalFo;
import com.cuterwrite.rbspring.service.MeetingService;
import com.cuterwrite.rbspring.util.Page;
import com.github.pagehelper.PageHelper;

@Service
public class MeetingServiceImpl implements MeetingService{
	
	@Autowired
	ConferenceMapper conferenceMapper;
	
	@Autowired
	PeriodicalFoMapper periodicalFoMapper;
	
	@Autowired
	PeriodicalCnMapper periodicalCnMapper;

	@Override
	public Page<Conference> getConference(Integer pageNumber, Integer pageSize) {
		PageHelper.startPage(pageNumber,pageSize);
		List<Conference>conferenceList=conferenceMapper.selectAll();
		return Page.restPage(conferenceList);
	}

	@Override
	public Page<PeriodicalFo> getPeriodicalFo(Integer pageNumber, Integer pageSize) {
		PageHelper.startPage(pageNumber,pageSize);
		List<PeriodicalFo>periodicalFoList=periodicalFoMapper.selectAll();
		return Page.restPage(periodicalFoList);
	}

	@Override
	public Page<PeriodicalCn> getPeriodicalCn(Integer pageNumber, Integer pageSize) {
		PageHelper.startPage(pageNumber,pageSize);
		List<PeriodicalCn>periodicalCnList=periodicalCnMapper.selectAll();
		return Page.restPage(periodicalCnList);
	}
	
}
