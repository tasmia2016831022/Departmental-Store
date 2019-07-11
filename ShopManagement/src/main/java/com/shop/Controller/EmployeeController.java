package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.model.Employee;
import com.shop.model.Owner;
import com.shop.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService  employeeService;
	
	

	@RequestMapping("/employee-register")
	public String registerEmployee(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_EMPLOYEE_REGISTER");
		return "homePage";
	}

	@PostMapping("/save-employee")
	public String registeruser(@ModelAttribute Employee employee, BindingResult bindingResult, HttpServletRequest request) {
		employeeService.saveEmployee(employee);
		request.setAttribute("mode", "MODE_EMPLOYEE_HOME");
		return "EmployeePage";
	}
	
	@RequestMapping("/employee-login-page")
	private String loginPage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_EMPLOYEE_LOGIN");
		return "homePage";

	}

	@RequestMapping("/employee-login")
	public String ownerlogin(@ModelAttribute Employee employee, HttpServletRequest request)
	{
		if(employeeService.findByEmployeenameAndEmployeepassword(employee.getEmployeename(), employee.getEmployeepassword())!=null)
				{
					request.setAttribute("mode", "MODE_EMPLOYEE_HOME");
					return "Employeepage";
				}
		else
		{
			//request.setAttribute("error", "Invalid Username or Password");
			System.out.println("hoinai");
			request.setAttribute("mode", "MODE_EMPLOYEE_LOGIN");
			return "homePage";
		}
	}
}

