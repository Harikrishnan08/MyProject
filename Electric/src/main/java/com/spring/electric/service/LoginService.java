package com.spring.electric.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.electric.Repository.LoginRepository;
import com.spring.electric.model.Electric;
import com.spring.electric.model.LoginModel;
@Service
public class LoginService {
	@Autowired
	public LoginRepository reo;
	
	public String checkLogin(String name,String pwd){
		LoginModel user=reo.findByname(name);
		if(user == null)
		{
			return "no user found";
		}
		else {
			
				if(user.getPwd().equals(pwd)) {
					return "Login Sucessfull";
				}
				else {
					return "Login Failed";
				}
		}
			
		}
		public LoginModel addUser(LoginModel mod) {
			return reo.save(mod);
		}
		public List<LoginModel> getUser(){
			return reo.findAll();
		}
	
		
	}
	


