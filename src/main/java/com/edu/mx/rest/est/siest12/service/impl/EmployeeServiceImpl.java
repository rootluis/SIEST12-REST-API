package com.edu.mx.rest.est.siest12.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.mx.rest.est.siest12.dao.EmployeeRepository;
import com.edu.mx.rest.est.siest12.entity.Employee;
import com.edu.mx.rest.est.siest12.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		Optional<Employee> optEmployee = employeeRepository.findById(employeeId);
		Employee objEmployee = null;

		if (optEmployee.isPresent()) {
			objEmployee = optEmployee.get();
		} else {
			throw new RuntimeException("No se localizo el empleado: " + employeeId);
		}

		return objEmployee;
	}

	@Override
	public void addEmployee(Employee objEmployee) {
		employeeRepository.save(objEmployee);

	}

}
