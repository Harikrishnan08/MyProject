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

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/question")

public class questioncontroller {
	@Autowired
	questionrepo qrepo;
	@Tag(name = "POSTING DETAILS",description = "#posting details using save method")
	@PostMapping("{qno}")
	public String saveDetails(@RequestBody question qno)
	{
		qrepo.save(qno);
		return "Data is saved";
		
		
	}
	

	
@Tag(name = "GET DETAILS BY ID",description = "#getting details of user using id")
	@GetMapping("/queryget/{qno}")

	public List<question> getdetails(@PathVariable int qno)

	{

		return qrepo.getD(qno);

	}

	
   @Tag(name = "UPDATE DETAILS",description = "#update details of users using query")
	@PutMapping("/queryupdate/{qno}/{qname}")

	public String updateDetails(@PathVariable int qno,@PathVariable String qname)

	{

		 qrepo.update(qno,qname); 
		 return "Updated Successfully";

	}

	
    @Tag(name = "DELETE DETAILS",description = "#deleting details from the table")
	@DeleteMapping("/deletequery/{qno}/{qname}")

	public String deleteDetails(@PathVariable int qno)

	{

		

		qrepo.deleteById(qno);

		return "Deleted Successfully";

	}
	@Tag(name = "GET ALL DETAILS",description = "#getting all details using jpql")
	@GetMapping("/jpql/{qno}")
	public List<question> get(@PathVariable int qno)
	{
		return qrepo.get(qno);
	}
	@Tag(name = "GET DETAILS USING BETWEEN",description = "getting details using between in jpql")
	@GetMapping("/jqpl/between/{qno}/{qid}")
	public List<question> getR(@PathVariable int qno,@PathVariable int qid)
	{
		return qrepo.getRange(qno,qid);
	}
}

	


