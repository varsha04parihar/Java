package com.microservice.employee.service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.employee.service.dto.Department;
import com.microservice.employee.service.dto.EmployeeResponse;
import com.microservice.employee.service.entity.Employee;
import com.microservice.employee.service.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public EmployeeResponse findEmployeeById(Long id) {
		Employee employee = employeeRepository.findEmployeeById(id);
		Department department =  restTemplate.getForObject("http://localhost:8001/departments/"+ employee.getDepartmentId(), Department.class);

		EmployeeResponse response = new EmployeeResponse();
		response.setEmployee(employee);
		response.setDepartment(department);
		return response;
		
	}
}

