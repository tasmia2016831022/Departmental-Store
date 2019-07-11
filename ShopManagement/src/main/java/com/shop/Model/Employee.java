package com.shop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_table")
public class Employee {
	private String employeename;
	private String employeeaddress;
	@Id
	private String employeephone;
	private String employeepassword;

	public Employee() {
		
	}

	public Employee(String employeename, String employeeaddress, String employeephone, String employeepassword) {
		
		this.employeename = employeename;
		this.employeeaddress = employeeaddress;
		this.employeephone = employeephone;
		this.employeepassword = employeepassword;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}

	public String getEmployeephone() {
		return employeephone;
	}

	public void setEmployeephone(String employeephone) {
		this.employeephone = employeephone;
	}

	public String getEmployeepassword() {
		return employeepassword;
	}

	public void setEmployeepassword(String employeepassword) {
		this.employeepassword = employeepassword;
	}

	@Override
	public String toString() {
		return "Employee [employeename=" + employeename + ", employeeaddress=" + employeeaddress + ", employeephone="
				+ employeephone + ", employeepassword=" + employeepassword + "]";
	}

}
