package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Poc1SpringBootSdjpaApplication extends SpringBootServletInitializer{

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// TODO Auto-generated method stub
		return application.sources(Poc1SpringBootSdjpaApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(Poc1SpringBootSdjpaApplication.class, args);
	}
}
