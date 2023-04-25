package com.spring.electric.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.electric.model.Electric;
@Repository
public interface ElectricRepository extends JpaRepository<Electric, Integer> {

}
