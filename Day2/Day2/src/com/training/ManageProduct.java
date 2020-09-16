package com.training;

public class ManageProduct {
	
	public double calculateDiscount(Product product)
	{
		double discount = 0.0;
		if(product.getRatePerUnit()>500 && product.getRatePerUnit()<=1000){
			discount=0.10;
		} 
		else if(product.getRatePerUnit()>1000)
		{
			discount=0.15;
		}
		return discount;
	}

public double findPercentage(Product product)
{  double discount = 0.0;
	switch(product.getProducttType()){
	case 1: 
		discount = 0.5;
		break;
	case 2:
		discount = 0.10;
		break;
	case 3:
		discount = 0.15;
		break;
	default:
		discount = 0.28;
		break;
		
		
	
	} 
	return discount;
}

}

