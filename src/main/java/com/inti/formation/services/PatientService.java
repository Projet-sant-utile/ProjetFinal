package com.inti.formation.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Patient;
import com.inti.formation.iRepositories.IPatientRepository;
import com.inti.formation.iServices.IPatientService;

@Service
public class PatientService extends GenericService<Patient, Integer> implements IPatientService {
	
	@Autowired
	protected IPatientRepository PRepo; 

	@Autowired
	public void setGenericRepository(JpaRepository<Patient, Integer> repo) {
		this.genericRepository = repo;
	}

	@Override
	public Patient findByHealthProfessional(int id_person, int id_healthProfessional) throws EntityNotFoundException {
		return null;
	}

	@Override
	public Patient findBySpeciality(int id_person, int id_healthProfessional) throws EntityNotFoundException {
		return null;
	}

	@Override
	public List<Patient> findByEmail(String email) throws EntityNotFoundException {
		return PRepo.findByEmail(email);
	}

}
