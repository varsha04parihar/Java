package com.microservice.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.department.service.entity.Department;
import com.microservice.department.service.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department save(Department department) {
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		return departmentRepository.findDepartmentById(id);
	}
	
}
