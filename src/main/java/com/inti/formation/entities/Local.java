package com.inti.formation.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.interfaces.IHasId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Local")
public class Local extends Location implements IHasId<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@OneToOne(mappedBy = "local")
	private CityHall cityHall;

	@Embedded
	private Availability availability;

	public Local(int idLocation, Address address, CityHall cityHall, Availability availability) {
		super(idLocation, address);
		this.cityHall = cityHall;
		this.availability = availability;
	}

	@JsonIgnore
	@Override
	public Integer getId() {
		return this.getIdLocation();
	}

	@Override
	public void setId(Integer i) {
		this.setIdLocation(i);

	}

}
