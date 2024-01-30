package com.shardabootcamp.SpringBootJpaDemo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shardabootcamp.SpringBootJpaDemo.Entity.Employee;
import com.shardabootcamp.SpringBootJpaDemo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository repository;
	
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployeeRecords(){
		List<Employee> employees = repository.findAll();
		return employees;
	}
	
	
	

}
