package com.training.example.two;

import com.training.ifaces.Automobile;

public class NewShowRoom extends ShowRoom{

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		if(key==3)return new Tractor();
		else
		return super.getProduct(key);
	}
	

}
