package com.inti.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.inti.interfaces.IHasId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Appointment  implements IHasId<Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int idAppointment;

	@ManyToOne
	@JoinColumn(name = "id_person") // referencedColumnName is optional
	private Patient patient;
	@ManyToOne
	@JoinColumn(name = "id_healthProfessional")
	private HealthProfessional healthProfessional;

	@Temporal(TemporalType.DATE)
	private Date appointmentDate;
	private int hourStart;
	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setId(Integer i) {
		// TODO Auto-generated method stub
		
	}

}
