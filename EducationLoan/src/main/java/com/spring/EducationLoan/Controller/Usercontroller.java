package com.spring.EducationLoan.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EducationLoan.Model.Loanmodel;
import com.spring.EducationLoan.Model.UserModel;
import com.spring.EducationLoan.Service.Serviceedu;

@RestController
@RequestMapping("/api")
public class Usercontroller {
	 
		@Autowired
		private Serviceedu service;
		@GetMapping()
		public List<UserModel> read(){
			return service.getUserModel();
		}
		@GetMapping("/{id}")
		public Optional<UserModel> readbyid(@PathVariable int id) {
			return service.getUserModelbyId(id);
		}
		@PostMapping()
		public UserModel create(@RequestBody UserModel um) {
			return service.addUserModel(um);
		}
		
		@DeleteMapping("/{id}")
		public String delete(@PathVariable int id) {
			return service.deleteUserModel(id);
			
			
	}
		@GetMapping()
		public List<Loanmodel> read1(){
			return service.getLoanmodel();
		}
		@GetMapping("/{id}")
		public Optional<Loanmodel> readbyid1(@PathVariable int id) {
			return service.getLoanmodelbyId(id);
		}
		@PostMapping()
		public Loanmodel create(@RequestBody Loanmodel lm) {
			return service.addLoanmodel(lm);
		}
		
		@DeleteMapping("/{delete}")
		public String delete1(@PathVariable int id) {
			return service.deleteLoanmodel(id);
			
			
	}
		


}
