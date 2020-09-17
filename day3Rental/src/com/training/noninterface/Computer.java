package com.training.noninterface;

import com.training.*;

public class Computer implements Item {

	@Override
	public double getRentalValue(int quantity) {
		// TODO Auto-generated method stub
		return quantity*200;
	}

}
