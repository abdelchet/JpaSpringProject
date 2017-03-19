package com.atos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atos.bean.Personne;
import com.atos.dao.PersonneDao;
import com.atos.service.PersonneService;

@Service("PersonneService")
public class PersonneServiceImpl implements PersonneService {

	PersonneDao persDao;
	
	public PersonneServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonneServiceImpl(PersonneDao persDao) {
		super();
		this.persDao = persDao;
	}

	
	public void save(Personne personne) {
		 persDao.save(personne);
	}

	@Override
	public List<Personne> findAll() {
	return persDao.getAll();
	}

	@Override
	public int delete(int id) {
	return persDao.delete(id);
	}

	@Override
	public Personne find(int id) {
	
		return persDao.find(id);
	}

}
