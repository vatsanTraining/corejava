package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lawyer rajesh=new Lawyer(494949,"Rajesh Khanna","Highcourt","B.l.");
		Musician aditya=new Musician(23222,"Aditya Narayan","Guitar","Mumbai");
		
		Billing bill=new Billing();
		bill.printFees(rajesh);
		bill.printFees(aditya);
	}

}
