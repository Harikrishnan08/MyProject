package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Repository.Trainrepo;
import com.example.model.Traindetails;

public class Service3class {
	@Autowired
	public Trainrepo ab;
	public Traindetails saveInfo(Traindetails td)
	{
		 return ab.save(td);
	}

}
