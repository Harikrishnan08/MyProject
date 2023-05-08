package com.spring.EducationLoan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.EducationLoan.Model.Loanmodel;
import com.spring.EducationLoan.Model.UserModel;
import com.spring.EducationLoan.Repository.Loanrepo;
import com.spring.EducationLoan.Repository.Userrepo;
@Service
public class Serviceedu {
	@Autowired
		public Userrepo repository;
		
		public List<UserModel> getUserModel(){
			return repository.findAll();
		}
		public Optional<UserModel> getUserModelbyId(int id) {
			return repository.findById(id);
		}
		public UserModel addUserModel(UserModel um) {
			return repository.save(um);
		}
		
		public String deleteUserModel(int id) {
			repository.deleteById(id);
			return id+" Deleted !";
		}
		
		@Autowired
		public Loanrepo repolr;

		public List<Loanmodel> getLoanmodel(){
			return repolr.findAll();
		}
		public Optional<Loanmodel> getLoanmodelbyId(int id) {
			return repolr.findById(id);
		}
		public Loanmodel addLoanmodel(Loanmodel lm) {
			return repolr.save(lm);
		}
		
		public String deleteLoanmodel(int id) {
			repolr.deleteById(id);
			return id+" Deleted !";
		}
		
		

}
