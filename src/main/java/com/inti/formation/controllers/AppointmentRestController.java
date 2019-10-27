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

import com.inti.formation.entities.Appointment;
import com.inti.formation.services.AppointmentService;

@RestController
@RequestMapping("/apiAppointment")
@CrossOrigin("*")
public class AppointmentRestController {
	
	@Autowired
	private AppointmentService service;
	
	@PostMapping("/add")
	public Appointment add(@RequestBody Appointment a) {
		return service.add(a);
	}
	
	@PutMapping("/update")
	public Appointment update(@RequestBody Appointment a) {
		return service.update(a);
	};
	
	@GetMapping("/get/{id}")
	public Appointment getById(@PathVariable int id) {
		return service.getById(id);
	};
	
	@GetMapping("/Appointments")
	public List<Appointment> findAll(){
		return service.findAll();
	};
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		service.deleteById(id);
	};
	
}
