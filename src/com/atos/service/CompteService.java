package com.atos.service;

import java.util.List;

import com.atos.bean.Compte;

public interface CompteService {

	int save(Compte compte);

	List<Compte> findAll();
	
	int delete(int id);

	Compte find(int id);
}
