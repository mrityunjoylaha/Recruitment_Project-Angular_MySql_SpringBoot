package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.RecruitmentUnderstanding;
import com.lti.services.IRecruitmentUnderstandingService;

@RestController
@RequestMapping(path = "RecruitmentUnderstanding")
@CrossOrigin
public class RecruitmentUnderstandingController {
	@Autowired
	private IRecruitmentUnderstandingService service1;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<RecruitmentUnderstanding> viewAllRecruitmentUnderstandingDetails() {
		List<RecruitmentUnderstanding> recruitmentUnderstanding = service1.findAllRecruitmentUnderstandingDetails();
		System.out.println(recruitmentUnderstanding);
		return recruitmentUnderstanding;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addrecruitmentUnderstanding(@RequestBody RecruitmentUnderstanding recruitmentUnderstanding) {
		service1.addRecruitmentUnderstanding(recruitmentUnderstanding);
		
	}
}