package com.inti.formation.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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
@DiscriminatorValue("Local")
public class Local extends Location  implements IHasId<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "local")
	private CityHall cityHall;

	@Embedded
	private Availability availability;

	@ManyToMany(mappedBy = "locals")
	private List<HealthProfessional> healthProfessionnals;

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return this.getIdLocation();
	}

	@Override
	public void setId(Integer i) {
		// TODO Auto-generated method stub
		this.setIdLocation(i);
		
	}

}
