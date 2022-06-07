package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee){
		
		return employeeRepository.save(employee);
		
	}
	
	
	public List<Employee> getAllUsers() {
		
		return employeeRepository.findAll();
		
	}


	public List<Employee> getAllEmployeesInADept(int deptId) {
		
		Department dept = new Department();
		dept.setId(deptId);
		
		return employeeRepository.findByDepartment(dept);
	}
	
	

}
