package com.inti.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class HealthProfessional extends Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String speciality;

	@Embedded
	private Availability availability;

	@ManyToOne
	@JoinColumn(name = " idLocation", referencedColumnName = "idLocation")
	private Office office;

	@ManyToMany
	@JoinTable(name = "healthProfessional_local", joinColumns = @JoinColumn(name = "idHealthProfessional"), inverseJoinColumns = @JoinColumn(name = "idLocation"))
	private List<Local> locals;

	@OneToMany(mappedBy = "healthProfessional")
	private List<Appointment> appointments;

}
