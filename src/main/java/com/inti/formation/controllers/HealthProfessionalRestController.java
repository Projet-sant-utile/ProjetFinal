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
import com.inti.formation.iServices.IGenericService;
import com.inti.formation.services.HealthProfessionalService;

@RestController
@RequestMapping("/apiHealthProfessional")
@CrossOrigin("*")
public class HealthProfessionalRestController {
	
	@Autowired
	private HealthProfessionalService service;
	
	@PostMapping("/add")
	public HealthProfessional add(@RequestBody HealthProfessional p) {
		return service.add(p);
	}
	
	@PutMapping("/update")
	public HealthProfessional update(@RequestBody HealthProfessional p) {
		return service.update(p);
	};
	
	@GetMapping("/get/{id}")
	public HealthProfessional getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/HealthProfessionals")
	public List<HealthProfessional> findAll(){
		return service.findAll();
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
