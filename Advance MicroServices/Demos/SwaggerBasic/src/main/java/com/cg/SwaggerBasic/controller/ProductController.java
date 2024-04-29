package com.cg.SwaggerBasic.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.SwaggerBasic.dto.Product;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value="Product Management System")
public class ProductController {
	ConcurrentMap<Integer,Product> myMap=new ConcurrentHashMap<>();
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Integer id) {
		return myMap.get(id);
		
		
	}
	@ApiOperation(value = "View a list of available products", response = List.class)
	@ApiResponses(value= {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
		    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
	})
	@GetMapping("/")
	public List<Product> getAll(){
		return new ArrayList<Product>(myMap.values());
	}
	@ApiOperation(value = "Add an product")
	@PostMapping("/add")
public Product addProduct(@ApiParam(value="Product value in JSON Format")@RequestBody Product prod) {
		myMap.put(prod.getProdId(),prod);
	return prod;
	
}
	
}
