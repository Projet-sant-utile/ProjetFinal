package com.inti.formation.iServices;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.inti.formation.entities.CityHall;

public interface ICityHallService extends IGenericService<CityHall, Integer> {
	
	public List<CityHall> findByEmail(String email) throws EntityNotFoundException;
	
}
