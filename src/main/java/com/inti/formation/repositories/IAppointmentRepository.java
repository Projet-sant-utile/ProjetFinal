package com.inti.formation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inti.formation.entities.Appointment;

public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {

}
