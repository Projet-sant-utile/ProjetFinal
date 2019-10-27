package com.inti.formation.iServices;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.inti.formation.entities.HealthProfessional;
import com.inti.formation.entities.User;

public interface IHealthProfessionalService extends IGenericService<HealthProfessional, Integer> {
	
	public List<HealthProfessional> findByEmail(String email) throws EntityNotFoundException;
	
}
