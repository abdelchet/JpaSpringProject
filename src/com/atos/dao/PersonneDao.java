package com.atos.dao;

import java.util.List;
import java.util.Set;

import com.atos.bean.Personne;

public interface PersonneDao {
	 void save(Personne person);
	 List<Personne>getAll();
	Personne find(int id);
	int delete(int id);
}
