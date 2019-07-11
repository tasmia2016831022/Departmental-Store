package com.shop.repository;

import org.springframework.data.repository.CrudRepository;

import com.shop.model.Employee;
import com.shop.model.Owner;

public interface EmployeeRepository extends CrudRepository<Employee, String>{
	public Employee findByEmployeenameAndEmployeepassword(String employeename , String employeepassword);
}
