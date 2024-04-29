package com.cg.DemoSecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.DemoSecurity.dto.Employee;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public Employee findByEmpId(Integer id);
	@Modifying
	@Query("UPDATE Employee e SET e.empName=:empName,e.empSalary=:empSalary WHERE e.empId=:empId")
    int updateEmployee(@Param("empName") String empName, @Param("empSalary") Double empSalary,@Param("empId") Integer empId);

}

