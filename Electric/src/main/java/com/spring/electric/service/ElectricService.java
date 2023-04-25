package com.spring.electric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.electric.model.Electric;
import com.spring.electric.repository.ElectricRepository;

@Service
public class ElectricService {
	@Autowired
	private ElectricRepository repository;
	public List<Electric> getElectric(){
		return repository.findAll();
	}
	public Optional<Electric> getElectricbyId(int id) {
		return repository.findById(id);
	}
	public Electric addElectric(Electric electric) {
		return repository.save(electric);
	}
	public Electric editRestaurant(Electric electric, int id) {
		Electric resx = repository.findById(id).orElse(null);
		if (resx != null) {
			resx.setRname(electric.getRname());
			resx.setRating(electric.getRating());	
			resx.setLocation(electric.getLocation());
			return repository.saveAndFlush(resx);
		}
		else {
			return null;
		}
	}
	public String deleteElectric(int id) {
		repository.deleteById(id);
		return id+" Deleted !";
	}
	public Electric editElectric(Electric electric, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Electric> getElectrics() {
		// TODO Auto-generated method stub
		return null;
	}
}
