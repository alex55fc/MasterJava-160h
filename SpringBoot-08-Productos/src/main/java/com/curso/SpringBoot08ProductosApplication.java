package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages="com.curso.model")
@EnableJpaRepositories(basePackages="com.curso.dao")
@SpringBootApplication(scanBasePackages= {"com.curso.controller", "com.curso.service"})
public class SpringBoot08ProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot08ProductosApplication.class, args);
	}

}
