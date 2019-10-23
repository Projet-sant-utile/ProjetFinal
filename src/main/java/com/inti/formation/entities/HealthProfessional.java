package com.inti.formation.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HealthProfessional extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String firstname;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String speciality;

	@Embedded
	private Availability availability;

	@ManyToOne
	@JoinColumn(name = " idLocation", referencedColumnName = "idLocation")
	private Office office;

	@JsonIgnore
	@OneToMany(mappedBy = "healthProfessional")
	private List<Appointment> appointments;

	public HealthProfessional(int idUser, Address address, String phoneNumber, String email, String password,
			String name, String firstname, Date birthday, String speciality, Availability availability, Office office,
			List<Appointment> appointments) {
		super(idUser, address, phoneNumber, email, password);
		this.name = name;
		this.firstname = firstname;
		this.birthday = birthday;
		this.speciality = speciality;
		this.availability = availability;
		this.office = office;
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
