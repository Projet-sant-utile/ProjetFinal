package com.inti.formation.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // Table_Per_Class Strategy : enables to implement each class
															// independently of each other
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public abstract class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Encapsulation of attibutes: private to protected
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected int idPerson;
	@Column(nullable = false)
	protected String name;
	@Column(nullable = false)
	protected String firstname;

	@Temporal(TemporalType.DATE)
	protected Date birthday;

	@Embedded
	protected Address address;
	protected String phoneNumber;
	protected String email;
	protected String password;

}
