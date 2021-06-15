package com.edu.mx.rest.est.siest12.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.mx.rest.est.siest12.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
