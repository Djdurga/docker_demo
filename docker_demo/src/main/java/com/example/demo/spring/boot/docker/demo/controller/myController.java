package com.example.demo.spring.boot.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myController {
	@GetMapping("/test-docker")
	public String getData() {
		return "Spring Boot Docker";
	}

}
