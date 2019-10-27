package com.inti.formation.iServices;


import javax.persistence.EntityNotFoundException;

import com.inti.formation.entities.CityHall;

public interface ICityHallService extends IGenericService<CityHall, Integer> {
	
	public CityHall findByEmail(String email) throws EntityNotFoundException;
	
}
