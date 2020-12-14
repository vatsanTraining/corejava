package com.training.day3.rental;
import java.util.*;
public class RentValue {
	public double getRent()
	{
		double rent=0;
		int choice;
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("Enter the item number ");
		System.out.println("1.furniture  2.Computer 3.Air conditioner  4.exit");
		choice=scan.nextInt();
		switch (choice) {
		case 1:new Furniture().equals(obj);
				break;
		case 2:rent+=new Computer(1);
				break;
		case 3:rent+=new AirConditioner(1);
				break;
		}
		
		}while(choice<4);
		return rent;
	}
}
