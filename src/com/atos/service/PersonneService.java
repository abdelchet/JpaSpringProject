package com.atos.service;

import java.util.List;

import com.atos.bean.Personne;

public interface PersonneService {

	void save(Personne personne);

	List<Personne> findAll();

	int delete(int id);

	Personne find(int id);

}
