package com.spring.onetomany.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.onetomany.model.answer;
public interface answerrepo extends JpaRepository<answer, Integer> {
	
	

}
