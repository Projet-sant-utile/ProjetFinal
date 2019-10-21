package com.inti.formation.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id_appointment;

	private List<Patient> patients = new ArrayList<Patient>();

	private List<HealthProfessional> healthProfessionals = new ArrayList<HealthProfessional>();

	// Lieu ?

	@Column(columnDefinition = "DATE")
	private LocalDate appointmentDate;


}
