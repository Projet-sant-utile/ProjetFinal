package com.inti.formation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Office;
import com.inti.formation.iServices.IOfficeService;

@Service
public class OfficeService extends GenericService<Office, Integer> implements IOfficeService{

	@Autowired
	public void setGenericRepository(JpaRepository<Office, Integer> repo) {
		this.genericRepository = repo;
	}
	
}
