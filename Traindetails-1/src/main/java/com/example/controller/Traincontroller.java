package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Service.Service3class;
import com.example.model.Traindetails;
@RestController
public class Traincontroller {
	@Autowired
	public Service3class tc;
	
	@PostMapping("/tdetails")
	public Traindetails addDetails(@RequestBody Traindetails td)
	{
		return tc.saveInfo(td);
	}
	

}
