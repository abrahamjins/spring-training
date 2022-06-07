package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public List<Department> getAllDepartments(){
		
		return departmentRepository.findAll();
		
	}
	
	public Department saveDepartment(Department dept) {
		
		return departmentRepository.save(dept);
	}

}
