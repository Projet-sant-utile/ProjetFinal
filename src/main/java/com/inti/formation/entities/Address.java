package com.inti.formation.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Address {

	private String streetNumber;
	private String streetName;
	private String city;
	private String zipCode;
	private String country;
	@Column(nullable = true)
	private double lat;
	@Column(nullable = true)
	private double lon;
	
}
