package com.spring.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationLoan.Model.Loanmodel;
public interface Loanrepo extends JpaRepository<Loanmodel, Integer> {


}
