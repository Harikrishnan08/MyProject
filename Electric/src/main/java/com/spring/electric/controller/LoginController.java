package com.spring.electric.controller;


	import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.electric.model.LoginModel;
import com.spring.electric.service.LoginService;


	@RestController
	@RequestMapping("/run")

	public class LoginController {
		@Autowired
		 LoginService service;
		
		@PostMapping("/login")
		public String login(@RequestBody Map<String ,String> loginData) {
			String name = loginData.get("name");
			String pwd = loginData.get("pwd");
			String result = service.checkLogin(name, pwd);
			return result;
		}
		@PostMapping("/adduser")
		public LoginModel AddUser(@RequestBody LoginModel log) {
			return service.addUser(log);
		}
		@GetMapping
		public List<LoginModel> listAll(){
			return service.getUser();
		}
	}

