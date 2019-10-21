package com.inti.formation.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

	@ManyToOne
	@JoinColumn(name = "id_patient")
	private Patient patient;
	@ManyToOne
	@JoinColumn(name = "id_health_professional")
	private HealthProfessional healthProfessional;

	// Lieu ?

	@Column(columnDefinition = "DATE")
	private LocalDate appointmentDate;

}
