package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product tv = new Product(1010,"LED TV",23000.0,1);
		
		ManageProduct mgr = new ManageProduct();
		
		double discount = mgr.calculateDiscount(tv);
		
		System.out.println("Discount - > "+ discount);
		
		double discountPercentage = mgr.findPercentage(tv);
		
		System.out.println("discount Percentage - > "+ discountPercentage);
		
	}

}
