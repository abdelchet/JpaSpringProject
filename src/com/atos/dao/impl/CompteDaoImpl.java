package com.atos.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atos.bean.Compte;
import com.atos.dao.CompteDao;

@Repository("compteDao")
public class CompteDaoImpl implements CompteDao{

	@PersistenceContext
	private EntityManager em;
	
	public CompteDaoImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	public CompteDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public int save(Compte compte) {
		 em.persist(compte);
		    return compte.getId_Compte();
	}

	@Override
	public List<Compte> getAll() {
		 return em.createQuery("SELECT c FROM COMPTE c", Compte.class).getResultList();
	}
	@Override
	public int delete(int id){
		Compte compte = em.find(Compte.class, id);
		 
		  em.getTransaction().begin();
		  em.remove(compte);
		  em.getTransaction().commit();
		  return id;
	}
	
	@Override
	public Compte find(int id){
		 Compte compte = em.find(Compte.class, id);
		 return compte;
	}
	

}
