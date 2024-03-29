package com.inti.formation.iRepositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Patient;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {
	
	Patient findByEmail(String email);

}
