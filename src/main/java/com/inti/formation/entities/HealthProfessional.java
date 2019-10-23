package com.inti.formation.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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

	@OneToMany(mappedBy = "healthProfessional")
	private List<Appointment> appointments;

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
