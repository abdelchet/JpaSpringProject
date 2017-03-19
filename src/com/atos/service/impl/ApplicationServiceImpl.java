package com.atos.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atos.bean.Application;
import com.atos.dao.ApplicationDao;
import com.atos.service.ApplicationService;

@Service("ApplicationService")
public class ApplicationServiceImpl implements ApplicationService {

	public ApplicationServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	ApplicationDao appDao; 
	
	public ApplicationServiceImpl(ApplicationDao appDao) {
		super();
		this.appDao = appDao;
	}

	@Override
	public int save(Application application) {
		return appDao.save(application);
	}

	@Override
	public List<Application> findAll() {
	
		return appDao.getAll();
	}

	@Override
	public int delete(int id) {
		return appDao.delete(id);
	}

	@Override
	public Application find(int id) {
		return appDao.find(id);
	}


}
