package com.cg.SpringBootMvc.service;

import java.util.List;
import java.util.Optional;

import com.cg.SpringBootMvc.dto.Employee;



public interface EmployeeService {
	public Employee addEmployee(Employee emp);
	public List<Employee> showEmployee();
	public Employee searchById(Integer id);
	public Employee updateData(Employee emp);
}
