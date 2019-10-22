package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.CityHall;

public interface ICityHallRepository extends JpaRepository<CityHall, Integer> {

}
