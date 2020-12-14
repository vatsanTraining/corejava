package com.training.noninterface;
import java.util.*;

public class Application {
	public static void main(String[] args) {
		double totalRent=0;
		RentalValue rv=new RentalValue();
		
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		int choice;

		System.out.println("Welcome to Rental Shop");
		System.out.println("Enter the choice you want to rent");
		System.out.println("1.Furniture  2.Computer  3.AirConditioner 4.Exit");
		do {
			choice=scan.nextInt();
			totalRent+=rv.calculateRent(choice);
			}while(choice<4);
		System.out.println("Total Rental Value=>"+totalRent);	
		scan.close();	
		}
}
