package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


/*
syntax:
netstat -ano | findstr :<PORT>
taskkill /PID <PID> /F

example:
netstat -ano | findstr :8080
taskkill /PID 12345 /F

*/
