package com.edu.mx.rest.est.siest12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.mx.rest.est.siest12.entity.Employee;
import com.edu.mx.rest.est.siest12.service.EmployeeService;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") Integer employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee objEmployee) {
		objEmployee.setCdEmployee(0);
		employeeService.addEmployee(objEmployee);
		return objEmployee;
	}

}
