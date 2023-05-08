package com.spring.EducationLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.EducationLoan.Model.UserModel;

public interface Userrepo extends JpaRepository<UserModel, Integer> {

}
