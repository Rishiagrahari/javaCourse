package com.cg.productinfofront.dto;

public class Product {
	
	private int prodId;
	private String prodName;
	private String prodPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int prodId, String prodName, String prodPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
	}

	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(String prodPrice) {
		this.prodPrice = prodPrice;
	}
	
	

}

