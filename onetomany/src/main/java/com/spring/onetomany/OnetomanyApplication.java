package com.spring.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( 
		 info =@Info( 
				  title = "Electricity Details", 
				   version = "1.1.2",
				    description = "Electric Project", 
				    contact = @Contact( 
				     name = "Hari",
				     email = "727821tuec048@skct.edu.in"
				     ) 
				  ) 
		 )
public class OnetomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

}
