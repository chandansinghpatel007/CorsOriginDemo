package com.csp.cod.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Allow Frontend
public class CrossOriginController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Spring Boot!";
	}
}
