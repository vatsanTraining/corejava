package com.training.noninterface;

import com.training.Item;

public class AirConditioner implements Item {

	@Override
	public double getRentalValue(int quantity) {
		// TODO Auto-generated method stub
		return quantity*1000;
	}

}
