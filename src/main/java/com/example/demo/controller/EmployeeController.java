package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.service.DepartmentService;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	DepartmentService deptService;

	@GetMapping("/employee/all")
	public List<Employee> getUser() {
		
		return employeeService.getAllUsers();

	}
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
		
	}
	
	
	@GetMapping("/department/all")
	public List<Department> getDepartments() {
		
		return deptService.getAllDepartments();

	}
	
	@PostMapping("/department")
	public Department createEmployee(@RequestBody Department department) {
		
		return deptService.saveDepartment(department);
		
	}
	
	@GetMapping("/employee/{deptId}")
	public List<Employee> getUsersInDept( @PathVariable int deptId ) {
		
		return employeeService.getAllEmployeesInADept(deptId);

	}
	
	

}
