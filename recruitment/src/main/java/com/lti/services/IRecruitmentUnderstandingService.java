package com.lti.services;


import java.util.List;

import com.lti.models.RecruitmentUnderstanding;

public interface IRecruitmentUnderstandingService {
public  List<RecruitmentUnderstanding> findAllRecruitmentUnderstandingDetails();
	
	public void addRecruitmentUnderstanding(RecruitmentUnderstanding recruitmentUnderstanding);
}
