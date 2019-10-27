package com.inti.formation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Local;
import com.inti.formation.iServices.ILocalService;

@Service
public class LocalService extends GenericService<Local, Integer> implements ILocalService {
	
	@Autowired
	public void setGenericRepository(JpaRepository<Local, Integer> repo) {
		this.genericRepository = repo;
	}
	
}
