package com.lti.dao;

import java.util.List;

import com.lti.models.AssembleData;

public interface IAssembleDataDao {

	//Select details
			public List<AssembleData> readAllAssembleData();
			
			
			//Insert details
			public void createAssembleData(AssembleData assembleData);
}
