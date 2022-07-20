package com.shop.footwear.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class MainController {

	@GetMapping
	public String getStudents() {
		System.out.println("Get student");
		return "Get student";
	}
	
	@PostMapping
	public String createStudents() {
		System.out.println("create student");
		return "create student";
	}
	
	@PutMapping
	public String updateStudents() {
		System.out.println("update student");
		return "update student";
	}
	
	@DeleteMapping
	public String deleteStudents() {
		System.out.println("delete student");
		return "delete student";
	}
}
