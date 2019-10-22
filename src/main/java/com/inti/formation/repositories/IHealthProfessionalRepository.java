package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.HealthProfessional;

public interface IHealthProfessionalRepository extends JpaRepository<HealthProfessional, Integer> {

}
