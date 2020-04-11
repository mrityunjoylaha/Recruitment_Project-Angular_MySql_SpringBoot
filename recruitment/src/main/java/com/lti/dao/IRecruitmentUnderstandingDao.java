package com.lti.dao;

import java.util.List;

import com.lti.models.RecruitmentUnderstanding;


public interface IRecruitmentUnderstandingDao {
	//select
		public List<RecruitmentUnderstanding> readAllRecruitmentUnderstandingDetails();
		
		//insert
		public void createRecruitmentUnderstandingDetails(RecruitmentUnderstanding recruitmentUnderstandingDetails);
	}
