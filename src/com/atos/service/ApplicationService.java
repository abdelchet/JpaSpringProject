package com.atos.service;

import java.util.List;

import com.atos.bean.Application;

public interface ApplicationService {

	int save(Application application);

	List<Application> findAll();
	
	int delete(int id);

	Application find(int id);

}
