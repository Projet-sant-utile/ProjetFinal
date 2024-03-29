package com.inti.formation.services;


import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.HealthProfessional;
import com.inti.formation.iRepositories.IHealthProfessionalRepository;
import com.inti.formation.iServices.IHealthProfessionalService;

@Service
public class HealthProfessionalService extends GenericService<HealthProfessional, Integer> implements IHealthProfessionalService{

	@Autowired
	protected IHealthProfessionalRepository HpRepo; 
	
	
	@Autowired
	public void setGenericRepository(JpaRepository<HealthProfessional, Integer> repo) {
		this.genericRepository = repo;
	}

	@Override
	public HealthProfessional findByEmail(String email) throws EntityNotFoundException {
		return HpRepo.findByEmail(email);
	}
	
}
