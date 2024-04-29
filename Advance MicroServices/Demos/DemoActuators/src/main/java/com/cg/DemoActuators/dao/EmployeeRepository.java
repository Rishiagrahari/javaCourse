package com.cg.DemoActuators.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.DemoActuators.dto.Employee;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
