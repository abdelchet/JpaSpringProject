package com.atos.dao;

import java.util.List;

import com.atos.bean.Compte;
import com.atos.bean.Personne;

public interface CompteDao {

	 int save(Compte compte);
	 List<Compte>getAll();
	int delete(int id);
	Compte find(int id);
}
