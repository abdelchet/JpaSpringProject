package com.atos.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atos.bean.Personne;
import com.atos.dao.PersonneDao;

@Repository("personneDao")
public class PersonneDaoImpl implements PersonneDao {


	@PersistenceContext
	private EntityManager em;
	
	public PersonneDaoImpl(EntityManager em){
		this.em= em;
	}

	public PersonneDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
  @Transactional
  public void save(Personne person) {
    em.persist(person);
    //return person.getId_Personne();
  }
	  
	public List<Personne>getAll() {
	    return em.createQuery("SELECT p FROM Personne p", Personne.class).getResultList();
	  }
	  
	  @Override
		public int delete(int id){
			Personne personne = em.find(Personne.class, id);
			 
			  em.getTransaction().begin();
			  em.remove(personne);
			  em.getTransaction().commit();
			  return id;
		}
		
		@Override
		public Personne find(int id){
			 Personne personne = em.find(Personne.class, id);
			 return personne;
		}
		

}