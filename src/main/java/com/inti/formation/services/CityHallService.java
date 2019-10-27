package com.inti.formation.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.CityHall;
import com.inti.formation.iRepositories.ICityHallRepository;
import com.inti.formation.iServices.ICityHallService;

@Service
public class CityHallService extends GenericService<CityHall, Integer> implements ICityHallService{

	@Autowired
	protected ICityHallRepository ChRepo;
	
	@Autowired
	public void setGenericRepository(JpaRepository<CityHall, Integer> repo) {
		this.genericRepository = repo;
	}

	@Override
	public List<CityHall> findByEmail(String email) throws EntityNotFoundException {
		return ChRepo.findByEmail(email);
	}
	
}
