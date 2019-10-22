package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
