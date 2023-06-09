package com.spring.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( 
		 info =@Info( 
				  title = "Programming Languages", 
				   version = "1.1.2",
				    description = "know about different progaramming lang!", 
				    contact = @Contact( 
				     name = "programmer",
				     email = "727821tuec048@skct.edu.in"
				     ) 
				  ) 
		 )
public class OnetomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

}
