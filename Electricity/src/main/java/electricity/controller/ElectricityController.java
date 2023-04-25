package com.spring.electricity.controller;

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

import com.spring.electricity.model.Electricity;
import com.spring.electricity.service.ElectricityService;

@RestController
@RequestMapping("/api")
public class RestaurantController {
	@Autowired
	private RestaurantService service;
	@GetMapping()
	public List<Restaurant> read(){
		return service.getRestaurants();
	}
	@GetMapping("/{id}")
	public Optional<Restaurant> readbyid(@PathVariable int id) {
		return service.getRestaurantbyId(id);
	}
	@PostMapping()
	public Restaurant create(@RequestBody Restaurant restaurant) {
		return service.addRestaurant(restaurant);
	}
	@PutMapping("/{id}")
	public Restaurant update(@RequestBody Restaurant restaurant, @PathVariable int id) {
		return service.editRestaurant(restaurant, id);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteRestaurant(id);
	}
}
