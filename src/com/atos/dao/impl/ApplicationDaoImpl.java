package com.atos.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atos.bean.Application;
import com.atos.bean.Compte;
import com.atos.dao.ApplicationDao;

@Repository("applicationDao")
public class ApplicationDaoImpl implements ApplicationDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public ApplicationDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}

	
	public ApplicationDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public int save(Application application) {
		 em.persist(application);
		    return application.getIdApplication();
	}

	@Override
	public List<Application> getAll() {
		 return em.createQuery("SELECT a FROM Application a", Application.class).getResultList();
	}
	
	@Override
	public int delete(int id){
		Application application = em.find(Application.class, id);
		 
		  em.getTransaction().begin();
		  em.remove(application);
		  em.getTransaction().commit();
		  return id;
	}
	
	@Override
	public Application find(int id){
		 Application application = em.find(Application.class, id);
		 return application;
	}
	

	
}
