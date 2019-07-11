package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.shop.model.Employee;
import com.shop.model.Owner;
import com.shop.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> employeedata(){
		List<Employee> all = new ArrayList<>(); 
		employeeRepository.findAll().forEach(all::add);
		return all;
	}
	
	public Employee findByEmployeenameAndEmployeepassword(String employeename , String employeepassword)
	{
		return employeeRepository.findByEmployeenameAndEmployeepassword(employeename, employeepassword);
	}

}