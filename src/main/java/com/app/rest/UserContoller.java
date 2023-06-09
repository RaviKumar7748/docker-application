package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContoller {
	
	@GetMapping("/hi")
	public String helloUser() {
		return "<h1>Welcome in Docker</h1>";
	}
}
