package com.spring.docker.compose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.spring.docker.compose"})
@EntityScan(basePackages = {"com.spring.docker.compose.models"})
@EnableJpaRepositories(basePackages = {"com.spring.docker.compose.repositories"})
public class DockerComposeSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(DockerComposeSpringApplication.class, args);
	}

}
