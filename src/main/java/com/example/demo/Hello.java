package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@CrossOrigin(origins = "*")
@RestController
public class Hello {

//	copy without the two slashes 
//	http://localhost:8080/hello

	@GetMapping("/emp")
	public String emp() {
		System.out.println("emp");
		return new Gson().toJson(new Employee(101, "Sonu", 90000));
	}

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "{'message':'Hello world!'}";
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

	@RequestMapping("/bank")
	public String bank() {
		System.out.println("Bank");
		return "Bank with Citi Bank";
	}

}