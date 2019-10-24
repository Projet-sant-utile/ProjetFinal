package com.inti.formation.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Patient;
import com.inti.formation.iRepositories.IPatientRepository;
import com.inti.formation.iServices.IPatientService;

@Service
public class PatientService extends GenericService<Patient, Integer> implements IPatientService {

	@Autowired
	private IPatientRepository repo;

	@Override
	public Patient add(Patient p) {
		return repo.save(p);
	}

	@Override
	public Patient update(Patient p) throws EntityNotFoundException {
		return repo.save(p);
	}

	@Override
	public void deleteById(Integer id_user) throws EntityNotFoundException {
		repo.deleteById(id_user);
	}

	@Override
	public Patient getById(Integer id_user) throws EntityNotFoundException {
		return repo.getOne(id_user);
	}

	@Override
	public List<Patient> findAll() {
		return repo.findAll();
	}

	@Override
	public Patient findByHealthProfessional(int id_person, int id_healthProfessional) throws EntityNotFoundException {
		return null;
	}

	@Override
	public Patient findBySpeciality(int id_person, int id_healthProfessional) throws EntityNotFoundException {
		return null;
	}

}
