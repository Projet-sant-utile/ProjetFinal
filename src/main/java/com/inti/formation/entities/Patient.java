package com.inti.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Patient extends Person implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointments;

}
