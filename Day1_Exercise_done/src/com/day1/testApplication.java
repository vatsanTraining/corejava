package com.day1;

public class testApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BloodDonar b1 = new BloodDonar();
		b1.setDonarName("gayatri");
		b1.setBloodGroup("A+");
		
	    System.out.println(b1.getDonarName());
		
		
		BloodDonar b2= new BloodDonar(101,"O+","harshita");
		
		 System.out.println(b2.getBloodGroup());
		 System.out.println(b2.getDonarName());
		
	}

}
