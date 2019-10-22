package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.HealthProfessional;

@Repository
public interface IHealthProfessionalRepository extends JpaRepository<HealthProfessional, Integer>{

}
