package com.lti.dao.impl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IDemandDetailsDao;
import com.lti.models.DemandDetails;


@Repository
public class DemandDetailsDaoImpl implements IDemandDetailsDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	public DemandDetailsDaoImpl() {

	}
	@Override
	public List<DemandDetails> readAllDemandDetails() {
		String jpql = "From DemandDetails";
		TypedQuery<DemandDetails> tquery = entityManager.createQuery(jpql, DemandDetails.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createDemandDetails(DemandDetails demandDetails) {
		entityManager.persist(demandDetails);
		
	}
	
	


}