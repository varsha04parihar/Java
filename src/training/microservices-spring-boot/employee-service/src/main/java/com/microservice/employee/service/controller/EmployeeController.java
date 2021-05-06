package com.microservice.employee.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.employee.service.dto.EmployeeResponse;
import com.microservice.employee.service.entity.Employee;
import com.microservice.employee.service.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/{id}")
	public EmployeeResponse findEmployeeById(@PathVariable("id") Long id) {
		return employeeService.findEmployeeById(id);
	}
}
