package com.spring.electric.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.electric.model.Electric;
import com.spring.electric.service.ElectricService;


@RestController
@RequestMapping("/api") 
public class ElectricController {
	@Autowired
	private ElectricService service;
	@GetMapping()
	public List<Electric> read(){
		return service.getElectrics();
	}
	@GetMapping("/{id}")
	public Optional<Electric> readbyid(@PathVariable int id) {
		return service.getElectricbyId(id);
	}
	@PostMapping()
	public Electric create(@RequestBody Electric electric) {
		return service.addElectric(electric);
	}
	@PutMapping("/{id}")
	public Electric update(@RequestBody Electric electric, @PathVariable int id) {
		return service.editElectric(electric, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteElectric(id);
	}
}
