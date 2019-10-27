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

import com.inti.formation.entities.HealthProfessional;
import com.inti.formation.services.HealthProfessionalService;

@RestController
@RequestMapping("/apiHealthProfessional")
@CrossOrigin("*")
public class HealthProfessionalRestController {
	
	@Autowired
	private HealthProfessionalService service;
	
	@PostMapping("/add")
	public HealthProfessional add(@RequestBody HealthProfessional h) {
		return service.add(h);
	}
	
	@PutMapping("/update")
	public HealthProfessional update(@RequestBody HealthProfessional h) {
		return service.update(h);
	};
	
	@GetMapping("/get/{id}")
	public HealthProfessional getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/HealthProfessionals")
	public List<HealthProfessional> findAll(){
		return service.findAll();
	};
	
	@GetMapping("/findByEmail/{email}")
	public List<HealthProfessional> findByEmail(@PathVariable String email){
		System.out.println(email);
		return service.findByEmail(email);
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
