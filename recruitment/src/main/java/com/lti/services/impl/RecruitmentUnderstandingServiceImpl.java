package com.lti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IRecruitmentUnderstandingDao;
import com.lti.models.RecruitmentUnderstanding;
import com.lti.services.IRecruitmentUnderstandingService;


@Service("service1")
public class RecruitmentUnderstandingServiceImpl implements IRecruitmentUnderstandingService {
	@Autowired
	private IRecruitmentUnderstandingDao dao;
	
	

	@Override
	public List<RecruitmentUnderstanding> findAllRecruitmentUnderstandingDetails() {
		return dao.readAllRecruitmentUnderstandingDetails();
	}

	@Override
	public void addRecruitmentUnderstanding(RecruitmentUnderstanding recruitmentUnderstanding) {
		dao.createRecruitmentUnderstandingDetails(recruitmentUnderstanding);

	}

}