package com.inti.formation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.inti.formation.entities.Appointment;
import com.inti.formation.iServices.IAppointmentService;

@Service
public class AppointmentService extends GenericService<Appointment, Integer> implements IAppointmentService {

	@Autowired
	public void setGenericRepository(JpaRepository<Appointment, Integer> repo) {
		this.genericRepository = repo;
	}
	
}
