package com.shardabootcamp.SpringBootJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardabootcamp.SpringBootJpaDemo.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
