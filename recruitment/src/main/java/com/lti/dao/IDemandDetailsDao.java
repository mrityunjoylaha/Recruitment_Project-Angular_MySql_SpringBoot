package com.lti.dao;

import java.util.List;

import com.lti.models.DemandDetails;

public interface IDemandDetailsDao {
	//Select details
		public List<DemandDetails> readAllDemandDetails();
		
		
		//Insert details
		public void createDemandDetails(DemandDetails demandDetails);
}

