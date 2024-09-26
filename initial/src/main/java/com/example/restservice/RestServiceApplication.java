package com.example.restservice;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication {

	final static Logger logger = LoggerFactory.getLogger(RestServiceApplication.class);


	public static void main(String[] args) {

		logger.info("Entering application.");
		SpringApplication app = new SpringApplication(RestServiceApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "5555"));
        app.run(args);
	}

}
