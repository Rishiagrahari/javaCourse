package com.cg.SpringBootMvc.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.SpringBootMvc.dao.EmployeeRepository;
import com.cg.SpringBootMvc.dto.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeerepository;
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeerepository.save(emp);
	}

	@Override
	public List<Employee> showEmployee() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	public Employee searchById(Integer id) {
		// TODO Auto-generated method stub
		return employeerepository.findByEmpId(id);
	}

	@Override
	public Employee updateData(Employee emp) {
		// TODO Auto-generated method stub
		
		employeerepository.updateEmployee(emp.getEmpName(), emp.getEmpSalary(), emp.getEmpId());
		return null;
	}

}
