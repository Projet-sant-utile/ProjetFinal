package com.inti.formation.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	@JoinColumn(name = "idLocal", unique = true)
	private Local local;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.getIdUser();
	}

	@Override
	public void setId(Integer i) {
		// TODO Auto-generated method stub
		this.setIdUser(i);
	}

}
