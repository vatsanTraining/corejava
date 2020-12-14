package com.training.ifaces;

public interface Automobile {
	//public static final as it is interface and variable belong to class and cannot be changed so final
	String APPNAME="Quotation Generation System";
	
	//all the methods are public abstract by default
	//to understand that we have added the same in different methods
	//all the methods have same access modifier
	public abstract String getColor();
	public String getModel();
	double getPrice();
	
	
}
