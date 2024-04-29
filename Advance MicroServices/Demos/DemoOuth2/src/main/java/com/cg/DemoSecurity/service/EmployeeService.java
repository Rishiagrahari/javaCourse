package com.cg.DemoSecurity.service;

import java.util.List;

import com.cg.DemoSecurity.dto.Employee;



public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> showEmployee();
	public Employee searchById(Integer id);
	public Employee updateData(Employee emp);
}
