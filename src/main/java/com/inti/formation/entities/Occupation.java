package com.inti.formation.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.interfaces.IHasId;

@Entity
public class Occupation implements IHasId<OccupationId> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OccupationId occupationId;

	@JsonIgnore
	@Override
	public OccupationId getId() {
		return this.getId();
	}

	@Override
	public void setId(OccupationId id) {
		this.setId(id);
	}
	
}
