package com.training;

public class Test {


	public static void main(String[] args) {
		Donor client = new Donor();
		
		client.setBloodtype("B+");
		client.setDonorName("Joey");
		
System.out.println(client.getDonorName());	
System.out.println(client.getBloodtype());


Donor client2 = new Donor("101","Chloe",35,"AB+");

System.out.println(client2.getDonorName()+ " with " +client2.getDonorID()+ " has " + client2.getBloodtype());
 }
}