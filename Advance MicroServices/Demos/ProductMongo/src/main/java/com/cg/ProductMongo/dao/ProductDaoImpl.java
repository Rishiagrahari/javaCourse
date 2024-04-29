package com.cg.ProductMongo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.cg.ProductMongo.dto.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	MongoTemplate mongotemplate;

	@Override
	public void addProduct(Product pro) {
		// TODO Auto-generated method stub
		mongotemplate.save(pro);
		
	}

	@Override
	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return mongotemplate.findAll(Product.class);
	}

	@Override
	public void removeProduct(int prodId) {
		// TODO Auto-generated method stub
		mongotemplate.remove(prodId);
		
	}

	@Override
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		
	}

}
