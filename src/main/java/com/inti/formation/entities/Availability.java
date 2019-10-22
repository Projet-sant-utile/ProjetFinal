package com.inti.formation.entities;

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
public class Availability {

	private int morningStart;
	private int morningEnd;
	private int afternoonStart;
	private int afternoonEnd;

}
