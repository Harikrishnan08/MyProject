package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Traindetails;

public interface Trainrepo extends JpaRepository<Traindetails, Integer> {

}
