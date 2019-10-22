package com.inti.formation.iRepositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.formation.entities.Appointment;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {

}
