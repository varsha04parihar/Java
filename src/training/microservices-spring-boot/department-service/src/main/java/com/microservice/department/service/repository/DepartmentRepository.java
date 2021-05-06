package com.microservice.department.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.department.service.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	
	Department findDepartmentById(Long id);

}
