package com.edu.mx.rest.est.siest12.service;

import com.edu.mx.rest.est.siest12.entity.Employee;

public interface EmployeeService {

	public Employee getEmployee(Integer employeeId);

	public void addEmployee(Employee objEmployee);

}
