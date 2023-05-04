package com.spring.electric.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.electric.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {

	LoginModel findByname(String name);

}
