package com.inti.formation.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.interfaces.IHasId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("Office")
public class Office extends Location implements IHasId<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonIgnore
	@OneToMany(mappedBy = "office")
	private List<HealthProfessional> healthProfessionals;

	public Office(int idLocation, Address address, List<HealthProfessional> healthProfessionals) {
		super(idLocation, address);
		this.healthProfessionals = healthProfessionals;
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
