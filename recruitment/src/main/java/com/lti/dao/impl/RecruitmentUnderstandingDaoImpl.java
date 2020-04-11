package com.lti.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IRecruitmentUnderstandingDao;
import com.lti.models.RecruitmentUnderstanding;

@Repository
public class RecruitmentUnderstandingDaoImpl implements IRecruitmentUnderstandingDao {

	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public RecruitmentUnderstandingDaoImpl() {

	}
	
	
	@Override
	public List<RecruitmentUnderstanding> readAllRecruitmentUnderstandingDetails() {
	String jpql = "From RecruitmentUnderstanding";
		
		TypedQuery<RecruitmentUnderstanding> tquery = entityManager.createQuery(jpql, RecruitmentUnderstanding.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createRecruitmentUnderstandingDetails(RecruitmentUnderstanding recruitmentUnderstandingDetails) {
		entityManager.persist(recruitmentUnderstandingDetails);
		
	}

}