package com.inti.formation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.CityHall;
import com.inti.formation.iServices.ICityHallService;

@Service
public class CityHallService extends GenericService<CityHall, Integer> implements ICityHallService{

	@Autowired
	public void setGenericRepository(JpaRepository<CityHall, Integer> repo) {
		this.genericRepository = repo;
	}
	
}
