package com.cg.ProductMongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ProductMongo.dto.Product;
import com.cg.ProductMongo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productservice;
	@PostMapping("/add")
	public ResponseEntity<String> addProduct(@RequestBody Product pro){
		if(pro==null) {
			return new ResponseEntity<String>("Product not added",HttpStatus.NOT_FOUND);
		}
		productservice.addProduct(pro);
		return new ResponseEntity<String>("Product added",HttpStatus.OK);
		
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Product>> showProduct(){
		List<Product> pro=productservice.getAllData();
		if(pro==null) {
			return new ResponseEntity("Product not Found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Product>>(pro,HttpStatus.OK);
		
	}
}
