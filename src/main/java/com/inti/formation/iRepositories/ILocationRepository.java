package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Location;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Integer> {

}
