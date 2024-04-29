package com.cg.ProductInfoClient.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ProductInfoClient.dto.Product;

@RestController
@RequestMapping("/info")
public class ProductInfoController {
	@GetMapping("/list")
	public List<Product> getAllProduct(){
		return Collections.singletonList(new Product(1001,"iPhone","2000"));
		
	}

}
