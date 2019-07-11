package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shop.model.Employee;
import com.shop.model.Owner;
import com.shop.service.EmployeeService;
import com.shop.service.OwnerService;

@RestController

public class RestCntroller {
	
	@Autowired
	private OwnerService ownerService;
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String Hello()
	{
		return "This is Homepage";
	}
	
	@GetMapping("/saveowner")
	public String saveOwner(@RequestParam String ownername,@RequestParam String owneraddress,@RequestParam String ownerphone,@RequestParam String ownerpassword)
	{
		Owner owner = new Owner(ownername, owneraddress, ownerphone,ownerpassword);
		ownerService.saveOwner(owner);
		return "Owner Saved";
	}
	
	@GetMapping("/saveemployee")
	public String saveEmployee(@RequestParam String employeename,@RequestParam String employeeaddress,@RequestParam String employeephone,@RequestParam String employeepassword)
	{
		Employee employee = new Employee(employeename, employeeaddress, employeephone, employeepassword);
		employeeService.saveEmployee(employee);
		return "Employee Saved";
	}
}
