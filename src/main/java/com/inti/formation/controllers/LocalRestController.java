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

import com.inti.formation.entities.Local;
import com.inti.formation.services.LocalService;

@RestController
@RequestMapping("/apiLocal")
@CrossOrigin("*")
public class LocalRestController {
	
	@Autowired
	private LocalService service;
	
	@PostMapping("/add")
	public Local add(@RequestBody Local l) {
		return service.add(l);
	}
	
	@PutMapping("/update")
	public Local update(@RequestBody Local l) {
		return service.update(l);
	};
	
	@GetMapping("/get/{id}")
	public Local getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/Locals")
	public List<Local> findAll(){
		return service.findAll();
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
