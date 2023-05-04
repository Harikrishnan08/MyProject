package com.spring.electric.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.electric.Repository.ElecticRepo;
import com.spring.electric.model.Electric;


@Service
public class ElectricService {
	
	@Autowired
	public ElecticRepo repository;
	
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
	//sort
	public List<Electric> sortDetails(String name) {
		return repository.findAll(Sort.by(name));
	}
	//pagination
	public List<Electric> page(int num, int size) {
		// TODO Auto-generated method stub
		Page<Electric> obj=repository.findAll(PageRequest.of(num, size));
		return obj.getContent();
	}
	public List<Electric> sortpage(int num, int size, String name) {
		Page<Electric> obj=repository.findAll(PageRequest.of(num, size, Sort.by(name)));
		return obj.getContent();
	}
}
