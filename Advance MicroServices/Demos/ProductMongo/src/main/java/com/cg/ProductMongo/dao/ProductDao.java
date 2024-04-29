package com.cg.ProductMongo.dao;

import java.util.List;

import com.cg.ProductMongo.dto.Product;

public interface ProductDao {
	
	public void addProduct(Product pro);
	public List<Product> getAllData();
	public void removeProduct(int prodId);
	public void updateProduct(Product pro);

}
