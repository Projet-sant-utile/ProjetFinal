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

import com.inti.formation.entities.CityHall;
import com.inti.formation.services.CityHallService;

@RestController
@RequestMapping("/apiCityHall")
@CrossOrigin("*")
public class CityHallRestController {
	
	@Autowired
	private CityHallService service;
	
	@PostMapping("/add")
	public CityHall add(@RequestBody CityHall c) {
		return service.add(c);
	}
	
	@PutMapping("/update")
	public CityHall update(@RequestBody CityHall c) {
		return service.update(c);
	};
	
	@GetMapping("/get/{id}")
	public CityHall getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/CityHalls")
	public List<CityHall> findAll(){
		return service.findAll();
	};
	
	@GetMapping("/findByEmail/{email}")
	public CityHall findByEmail(@PathVariable String email){
		System.out.println(email);
		return service.findByEmail(email);
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
