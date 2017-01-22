package com.example;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.Controller.StudentProducer;

@Configuration
@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig{

	public JerseyConfig() {
		register(StudentProducer.class);
	}

}
