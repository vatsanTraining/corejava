package com.training.noninterface;
import java.util.*;

public class RentalValue {
	public double calculateRent(int choice) {
		double rent=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter quantity for Item");
		int quantity=scan.nextInt();
		switch(choice) {
		case 1:rent=new Furniture().getRentalValue(quantity);
				break;
		
		case 2:rent=new Computer().getRentalValue(quantity);
				break;
		case 3:rent=new AirConditioner().getRentalValue(quantity);
				break;
		}
		
		return rent;
	}
}
