package com.lti.services;

import java.util.List;

import com.lti.models.AssembleData;;

public interface IAssembleDataService {

	public  List<AssembleData> findAllAssembleData();
	
	
	public void addAssembleData(AssembleData assembleData);
}
