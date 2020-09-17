package com.training.example.two;

import com.training.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Kia";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 800000.0;
	}

}
