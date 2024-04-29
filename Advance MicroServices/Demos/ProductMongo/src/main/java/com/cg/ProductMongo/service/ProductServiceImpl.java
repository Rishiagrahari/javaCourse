package com.cg.ProductMongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ProductMongo.dao.ProductDao;
import com.cg.ProductMongo.dto.Product;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductDao productdao;

	@Override
	public void addProduct(Product pro) {
		// TODO Auto-generated method stub
		productdao.addProduct(pro);
	}

	@Override
	public List<Product> getAllData() {
		// TODO Auto-generated method stub
		return productdao.getAllData();
	}

	@Override
	public void removeProduct(int prodId) {
		// TODO Auto-generated method stub
		productdao.removeProduct(prodId);
	}

	@Override
	public void updateProduct(Product pro) {
		// TODO Auto-generated method stub
		productdao.updateProduct(pro);
	}

}
