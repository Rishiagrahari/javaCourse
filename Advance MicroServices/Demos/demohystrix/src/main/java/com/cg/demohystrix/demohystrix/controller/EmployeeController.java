package com.cg.demohystrix.demohystrix.controller;

import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/rest")
public class EmployeeController {
	@HystrixCommand(fallbackMethod="whengetnotwork",commandKey="hello",groupKey="hello")
	@GetMapping("/getAll")
	public String getData() {
		if(RandomUtils.nextBoolean()) {
			throw new RuntimeException("failed");
		}
		return "hello world";
	}
	public String whengetnotwork(){
		return "GET Not Working";
		
	}
}
