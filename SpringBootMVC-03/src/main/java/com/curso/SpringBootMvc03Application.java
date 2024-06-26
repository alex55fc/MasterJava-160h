package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.curso.controller", "com.curso.service"})
public class SpringBootMvc03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvc03Application.class, args);
	}

}
