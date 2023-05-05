package com.spring.onetomany1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition( 
		 info =@Info( 
				  title = "BOOK DETAILS", 
				   version = "1.1.2",
				    description = "know about different bookks!", 
				    contact = @Contact( 
				     name = "programmer",
				     email = "727821tuec048@skct.edu.in"
				     ) 
				  ) 
		 )

public class Onetomany1Application {

	public static void main(String[] args) {
		SpringApplication.run(Onetomany1Application.class, args);
	}

}
