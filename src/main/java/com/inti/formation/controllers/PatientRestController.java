package com.inti.formation.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inti.formation.entities.Patient;
import com.inti.formation.services.PatientService;

@RestController
@RequestMapping("/apiPatient")
@CrossOrigin("*")
public class PatientRestController {
	
	@Autowired
	private PatientService service;
	
	@PostMapping("/add")
	public Patient add(@RequestBody Patient p) {
		return service.add(p);
	}
	
	@PutMapping("/update")
	public Patient update(@RequestBody Patient p) {
		return service.update(p);
	};
	
	@GetMapping("/get/{id}")
	public Patient getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/Patients")
	public List<Patient> findAll(){
		return service.findAll();
	};
	
	@GetMapping("/findByEmail/{email}")
	public List<Patient> findByEmail(@PathVariable String email){
		System.out.println(email);
		return service.findByEmail(email);
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
