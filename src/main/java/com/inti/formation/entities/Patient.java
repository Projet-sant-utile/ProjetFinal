package com.inti.formation.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
@Getter
@Setter
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

//	@JsonSerialize(using = LocalDateTimeSerializer.class)
//	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
//	@Column(columnDefinition = "DATE")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "YYYY-MM-DD")
	private Date birthday;

	@JsonIgnore
	@OneToMany(mappedBy = "patient")
	private List<Appointment> appointments;

	public Patient(int idUser, Address address, String phoneNumber, String email, String password, String name,
			String firstname, Date birthday, List<Appointment> appointments) {
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

	@Override
	public String toString() {
		return "Patient [name=" + name + ", firstname=" + firstname + ", birthday=" + birthday + ", appointments="
				+ appointments + ", idUser=" + idUser + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", password=" + password + "]";
	}

}
