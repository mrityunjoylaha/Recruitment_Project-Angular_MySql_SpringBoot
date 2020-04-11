package com.lti.services;


import java.util.List;

import com.lti.models.DemandDetails;

public interface IDemandDetailsService {
	
	public  List<DemandDetails> findAllDemandDetails();
	
	
	public void addDemandDetails(DemandDetails demandDetails);
}