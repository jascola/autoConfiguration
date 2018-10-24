package com.jascola;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootApplication {
	Logger logger = LoggerFactory.getLogger(SpringApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
