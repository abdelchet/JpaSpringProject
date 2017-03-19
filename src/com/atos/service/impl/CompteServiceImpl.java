package com.atos.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.atos.bean.Compte;
import com.atos.dao.CompteDao;
import com.atos.service.CompteService;

public class CompteServiceImpl implements CompteService {

	
	CompteDao compteDao;
	
	public CompteServiceImpl(CompteDao compteDao) {
		super();
		this.compteDao = compteDao;
	}

	@Override
	public int save(Compte compte) {
		return compteDao.save(compte);
	}

	@Override
	public List<Compte> findAll() {
		return compteDao.getAll();
	}

	@Override
	public int delete(int id) {
		
		return compteDao.delete(id);
	}

	@Override
	public Compte find(int id) {
		return compteDao.find(id);
	}

}
