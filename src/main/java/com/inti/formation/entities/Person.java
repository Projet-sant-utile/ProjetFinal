package com.inti.formation.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int idPerson;
	private String name;
	private String firstname;
	@Column(columnDefinition = "DATE")
	private LocalDate birthday;
	
	@Embedded
	private Address address;
	private String phoneNumber;
	private String email;
	private String password;

}
