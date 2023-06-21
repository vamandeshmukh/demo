package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

//	copy without the two slashes 
//	http://localhost:8080/hello
		
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello world!";
	}

	@RequestMapping("/cards")
	public String cards() {
		System.out.println("Cards");
		return "Issuing you cards...";
	}

	@RequestMapping("/lend")
	public String lend() {
		System.out.println("Lend");
		return "Lending you loans...";
	}



}