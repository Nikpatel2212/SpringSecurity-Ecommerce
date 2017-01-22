package com.RestMain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.RestMain.*")
public class SpringRestNikApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestNikApplication.class, args);
	}
}
