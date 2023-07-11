package com.gl.Library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.Library.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	
}