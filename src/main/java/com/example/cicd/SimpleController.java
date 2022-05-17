package com.example.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SimpleController {
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/Hello")
	public void example() {
		System.out.println("Test 1");
	}
}
