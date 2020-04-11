package com.lti.services.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.IDemandDetailsDao;
import com.lti.models.DemandDetails;
import com.lti.services.IDemandDetailsService;


@Service("service")
public class DemandDetailsServiceImpl implements IDemandDetailsService {
	
	@Autowired
	private IDemandDetailsDao dao;
	
	

	@Override
	public List<DemandDetails> findAllDemandDetails() {
		
		return dao.readAllDemandDetails();

	}

	@Override
	public void addDemandDetails(DemandDetails demandDetails) {
		dao.createDemandDetails(demandDetails);
	}

}