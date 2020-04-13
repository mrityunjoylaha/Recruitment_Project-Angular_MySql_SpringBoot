package com.lti.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.IAssembleDataDao;
import com.lti.models.AssembleData;

@Repository
public class AssembleDataDaoImpl implements IAssembleDataDao {
	@PersistenceContext
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<AssembleData> readAllAssembleData() {
		String jpql = "From AssembleData";
		TypedQuery<AssembleData> tquery = entityManager.createQuery(jpql, AssembleData.class);
		System.out.println(tquery);
		return tquery.getResultList();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void createAssembleData(AssembleData assembleData) {
		entityManager.persist(assembleData);
	}

	
}
