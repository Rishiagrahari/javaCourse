package com.cg.SpringBootMvc.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.SpringBootMvc.dto.Employee;
import com.cg.SpringBootMvc.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeServiceimpl;
	
	@PostMapping(value="/addemp")
	public ModelAndView addData(@ModelAttribute("myemp") @Valid Employee emp,BindingResult error){
	if(error.hasErrors()) {
		return new ModelAndView("Add");
	}
	employeeServiceimpl.addEmployee(emp);
	List<Employee> myList=employeeServiceimpl.showEmployee();
	return new ModelAndView("index","myList", myList);
	}
	@GetMapping(value="/")
	public ModelAndView showData(){
	List<Employee> myList=employeeServiceimpl.showEmployee();
	return new ModelAndView("index","myList", myList);
		
	}
	
	@GetMapping(value="/add")
	public ModelAndView addPage(@ModelAttribute("myemp")Employee emp){
		
		return new ModelAndView("Add");
	}
	
	@GetMapping(value="/update")
	public ModelAndView updatePage(@RequestParam("id") Integer id,@ModelAttribute("dataemp") Employee empo ){
		
		Employee emp=employeeServiceimpl.searchById(id);
		
		return new ModelAndView("Update","dataemp",emp);
	}
	@PostMapping(value="/updateemp")
	public ModelAndView updateData(@ModelAttribute("dataemp") Employee empo ){
		
		employeeServiceimpl.updateData(empo);
		List<Employee> myList=employeeServiceimpl.showEmployee();
		return new ModelAndView("index","myList", myList);
			
	}
}
