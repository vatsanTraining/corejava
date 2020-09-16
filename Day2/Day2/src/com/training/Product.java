package com.training;

public class Product {
	public Product(int productID, String productName, double ratePerUnit,
			int producttType) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.producttType = producttType;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int productID;
	private String productName;
	private double ratePerUnit;
	private int producttType ;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public int getProducttType() {
		return producttType;
	}
	public void setProducttType(int producttType) {
		this.producttType = producttType;
	}

}