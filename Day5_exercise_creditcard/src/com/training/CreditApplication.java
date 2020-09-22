package com.training;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.training.Domain.CreditCard;
import com.training.Service.BusinessService;

public class CreditApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice=0;
		File file=null;
		Scanner scan=new Scanner(System.in);
		ArrayList<CreditCard> creditCardList=new ArrayList<>();
		BusinessService bs=new BusinessService();
		System.out.println("want to enter file location  1.yes  2.default laocation");
		int loc=scan.nextInt();
		if(loc==1) {
			System.out.println("Enter the location");
			String locationFile=scan.next();
			file=new File(locationFile);
		}
		else {
			file=new File("default.txt");
		}
		String name=null;	
		CreditCard card=new CreditCard();
		
		do {
			System.out.println("1.store 2.retrieve 3.delete  4.exit");
			scan.nextLine();
			choice=scan.nextInt();
			scan.nextLine();
			//System.out.println("hi error");
			switch (choice) {
			case 1:card=createRecord();
					creditCardList=bs.store(creditCardList, card, file);
					break;
			case 2:System.out.println("Enter the holder name");
					name=scan.next();
					System.out.println(bs.retrieve(file, name));
					break;
			case 3:System.out.println("Enter the holder name");
					name=scan.next();
					creditCardList=bs.delete(creditCardList, name, file);
					break;
			}
			
		}while(choice<4);
		//scan.close();

}
	
	public static CreditCard createRecord() {
		CreditCard card=new CreditCard();
		Scanner scan=null;
		System.out.println("Enter the credit card details\n1.HolderName  2.AccountNumber  3.CreditHoldingFees");
		try {
			scan=new Scanner(System.in);
			card.setHolderName(scan.next());
			card.setAccountNumber(scan.nextDouble());
			card.setHoldingFees(scan.nextDouble());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
			e.printStackTrace();
		}finally {
			scan.close();
		}
		
		return card;
	}
}
