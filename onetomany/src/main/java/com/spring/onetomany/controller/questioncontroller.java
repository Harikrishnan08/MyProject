package com.spring.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.onetomany.model.question;
import com.spring.onetomany.repo.questionrepo;

@RestController
@RequestMapping("/question")

public class questioncontroller {
	@Autowired
	questionrepo qrepo;
	
	@PostMapping("{qno}")
	public String saveDetails(@RequestBody question qno)
	{
		qrepo.save(qno);
		return "Data is saved";
		
		
	}
	

	

	@GetMapping("/queryget/{qno}")

	public List<question> getdetails(@PathVariable int qno)

	{

		return qrepo.getD(qno);

	}

	

	@PutMapping("/queryupdate/{qno}/{qname}")

	public void updateDetails(@PathVariable int qno,@PathVariable String qname)

	{

		 qrepo.update(qno,qname); 

	}

	

	@DeleteMapping("/deletequery/{qno}/{qname}")

	public String deleteDetails(@PathVariable int qno)

	{

		

		qrepo.deleteById(qno);

		return "Deleted Successfully";

	}
	@GetMapping("/jpql/{qno}")
	public List<question> get(@PathVariable int qno)
	{
		return qrepo.get();
	}
	
	@GetMapping("/jqpl/between/{qno}/{qid}")
	public List<question> getR(@PathVariable int qno,@PathVariable int qid)
	{
		return qrepo.getRange(qno,qid);
	}
}

	


