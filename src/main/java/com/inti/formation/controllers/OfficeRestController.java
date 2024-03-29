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

import com.inti.formation.entities.Office;
import com.inti.formation.services.OfficeService;

@RestController
@RequestMapping("/apiOffice")
@CrossOrigin("*")
public class OfficeRestController {
	
	@Autowired
	private OfficeService service;
	
	@PostMapping("/add")
	public Office add(@RequestBody Office o) {
		return service.add(o);
	}
	
	@PutMapping("/update")
	public Office update(@RequestBody Office o) {
		return service.update(o);
	};
	
	@GetMapping("/get/{id}")
	public Office getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/Offices")
	public List<Office> findAll(){
		return service.findAll();
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
