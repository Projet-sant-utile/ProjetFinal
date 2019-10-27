package com.inti.formation.iServices;


import javax.persistence.EntityNotFoundException;

import com.inti.formation.entities.HealthProfessional;

public interface IHealthProfessionalService extends IGenericService<HealthProfessional, Integer> {
	
	public HealthProfessional findByEmail(String email) throws EntityNotFoundException;
	
}
