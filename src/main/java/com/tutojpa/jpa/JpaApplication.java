package com.tutojpa.jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
		System.out.println("JPA app ");
	}
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student dylan = new Student(
					
					"Dylan", 
					"Vallejo", 
					"dylan.vallejo@gmail.com", 
					23
			);
			studentRepository.save(dylan);
		};
	}

}
