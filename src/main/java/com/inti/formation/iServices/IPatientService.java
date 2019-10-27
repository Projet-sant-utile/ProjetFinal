package com.inti.formation.iServices;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.inti.formation.entities.Patient;

public interface IPatientService extends IGenericService<Patient, Integer> {

	public Patient findByHealthProfessional(int id_person, int id_healthProfessional) 
			throws EntityNotFoundException;

	public Patient findBySpeciality(int id_person, int id_healthProfessional) 
			throws EntityNotFoundException;
	
	public List<Patient> findByEmail(String email) throws EntityNotFoundException;

}
