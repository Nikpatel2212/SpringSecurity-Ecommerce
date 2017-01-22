package com.example;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan({ "com.example"})
@ComponentScan(basePackages={ "com.example.*" })
@EnableJpaRepositories(basePackages={"com.example.*"})
public class SpringRestProduceNikApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestProduceNikApplication.class, args);
		
		System.out.println("hello.!!");
	}
}
