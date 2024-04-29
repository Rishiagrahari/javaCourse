package com.cg.ProductMongo.service;

import java.util.List;

import com.cg.ProductMongo.dto.Product;

public interface ProductService {
	public void addProduct(Product pro);
	public List<Product> getAllData();
	public void removeProduct(int prodId);
	public void updateProduct(Product pro);

}
