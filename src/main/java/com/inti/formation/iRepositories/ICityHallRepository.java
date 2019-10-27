package com.inti.formation.iRepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.CityHall;

@Repository
public interface ICityHallRepository extends JpaRepository<CityHall, Integer> {
	
	List<CityHall> findByEmail(String email);

}
