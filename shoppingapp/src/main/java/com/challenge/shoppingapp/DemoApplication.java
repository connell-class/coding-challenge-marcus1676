package com.challenge.shoppingapp;

import com.challenge.dao.GroceryListRepo;
import com.challenge.model.GroceryList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	GroceryListRepo repo;
	@Bean
	CommandLineRunner runner() {
		return (args) -> {
			
			repo.save(new GroceryList(1, "name"));
		};
	}
}

	
