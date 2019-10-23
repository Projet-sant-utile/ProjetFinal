package com.inti.formation.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CityHall extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "idLocation", unique = true)
	private Local local;

	public CityHall(int idUser, Address address, String phoneNumber, String email, String password, Local local) {
		super(idUser, address, phoneNumber, email, password);
		this.local = local;
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
