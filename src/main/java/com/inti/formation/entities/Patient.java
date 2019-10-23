package com.inti.formation.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })

public class Patient extends User {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String firstname;

	@Column(columnDefinition = "DATE")
	private LocalDate birthday;

	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointments;

	public Patient(int idUser, Address address, String phoneNumber, String email, String password, String name,
			String firstname, LocalDate birthday, List<Appointment> appointments) {
		super(idUser, address, phoneNumber, email, password);
		this.name = name;
		this.firstname = firstname;
		this.birthday = birthday;
		this.appointments = appointments;
	}

	@JsonIgnore
	@Override
	public Integer getId() {
		return this.getIdUser();
	}

	@Override
	public void setId(Integer i) {
		this.setIdUser(i);

	}

}
