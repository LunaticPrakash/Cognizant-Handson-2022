package com.cognizant.truyum;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient
public class TruyumApplication {
private static final Logger LOGGER = LoggerFactory.getLogger(TruyumApplication.class);
	
	public static void main(String[] args) throws ParseException {
		SpringApplication.run(TruyumApplication.class, args);
		LOGGER.info("Inside main");
		
	}

}
