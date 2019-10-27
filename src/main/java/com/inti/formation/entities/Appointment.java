package com.inti.formation.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.interfaces.IHasId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment implements IHasId<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int idAppointment;

	@ManyToOne
	@JoinColumn(name = "idUser") // referencedColumnName is optional
	private Patient patient;
	@ManyToOne
	@JoinColumn(name = "idHealthProfessional")
	private HealthProfessional healthProfessional;

	@ManyToOne
	@JoinColumn(name = "idLocation")
	private Location location;

	@Temporal(TemporalType.DATE)
	private Date appointmentDate;
	private int hourStart;

	@JsonIgnore
	@Override
	public Integer getId() {
		return this.getIdAppointment();
	}

	@Override
	public void setId(Integer i) {
		this.setIdAppointment(i);

	}

}
