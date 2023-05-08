package com.spring.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationLoan.Model.Loginmodel;

public interface Loginrepo extends JpaRepository<Loginmodel, Integer> {

}
