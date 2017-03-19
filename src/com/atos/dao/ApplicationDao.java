package com.atos.dao;

import java.util.List;

import com.atos.bean.Application;

public interface ApplicationDao {

	int save(Application application);

	List<Application> getAll();

	int delete(int id);

	Application find(int id);

}
