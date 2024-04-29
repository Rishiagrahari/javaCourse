package com.cg.productinfofront.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.productinfofront.dto.Product;

@RestController
@RequestMapping("/getall")
public class ProductInfoController {
	@Autowired
	RestTemplate resttemplate;
	@GetMapping("/info")
	public List<Product> getAllProduct(){
		Product[] pro=resttemplate.getForObject("http://product-info-service/info/list", Product[].class);
		return Arrays.asList(pro);
		
	}

}
