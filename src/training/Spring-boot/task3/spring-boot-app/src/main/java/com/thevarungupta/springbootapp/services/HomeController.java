package com.thevarungupta.springbootapp.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(path = "/test")
	public String test() {
		System.out.println("Test Called");
		return "Test Methods";
	}
	
	@GetMapping(path = "/test/{name}")
	public String testWithParameter(@PathVariable String name) {
		System.out.println("Test Method: "+ name);
		return "Test Method : "+ name;
	}
}
