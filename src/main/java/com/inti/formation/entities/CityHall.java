package com.inti.formation.entities;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
public class CityHall  implements IHasId<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int idCityHall;

	@Embedded
	private Address adresse;
	@OneToOne
	@JoinColumn(name = "id_local", unique = true)
	private Local local;
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
