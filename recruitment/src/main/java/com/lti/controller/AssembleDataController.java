package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.models.AssembleData;
import com.lti.services.IAssembleDataService;


@RestController
@RequestMapping(path = "assembledata")
@CrossOrigin
public class AssembleDataController {

	@Autowired
	private IAssembleDataService service1;

	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AssembleData> viewAllAssembleData() {
		List<AssembleData> assembleData = service1.findAllAssembleData();
		System.out.println(assembleData);
		return assembleData;
	}
	
	// http://localhost:9090/RecruitmentUnderstanding
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addAssembleData(@RequestBody AssembleData assembleData) {
		service1.addAssembleData(assembleData);
		
	}
}
