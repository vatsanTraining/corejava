package com.training.Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

import com.training.Domain.CreditCard;

public class BusinessService {
	public ArrayList<CreditCard> store(ArrayList<CreditCard> creditCardList,CreditCard card,File file)
	{
		//storing to credit card list array as well as to file in the append mode
		creditCardList.add(card);
		BufferedWriter bw=null;
		
		try {
		
		bw=new BufferedWriter(new FileWriter(file,true));
		bw.write(card.toString());
		bw.newLine();
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
			bw.close();
			}catch(IOException io)
			{
				io.printStackTrace();
			}
		}
		return creditCardList;
		
	}
	public CreditCard retrieve(File file,String accountHolderName) {
		
		//retrieving from file on the basis of account holders name
		CreditCard card=new CreditCard();
		String line=null;
		String []object=null;
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader(file));
			while((line=br.readLine())!=null)
			{
				object=line.split(",");
				if(object[0].equals(accountHolderName))
				{
					break;
				}
			}
			card.setHolderName(object[0]);
			card.setAccountNumber(Double.parseDouble(object[1]));
			card.setHoldingFees(Double.parseDouble(object[2]));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}

		}
		return card;
		
	}
	public ArrayList<CreditCard> delete(ArrayList<CreditCard> creditCardList,String accountHolderName,File file) throws IOException
	{
		//deleting record from array list as well as from writing data to new file and renaming it
		int deletedIndex=0;
		for(CreditCard card:creditCardList)
		{
			if((card.getHolderName()).equals(accountHolderName))
			{
				creditCardList.remove(deletedIndex);
			}
			deletedIndex++;
		}
		
		//writing to file
		
		//File dummyFile=new File("dummy.txt");
		BufferedWriter bw=null;
		try {
		bw=new BufferedWriter(new FileWriter(file));
		for(CreditCard card:creditCardList)
		{
			
				bw.write(card.toString());
				bw.newLine();
			
		}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			bw.close();
		}
		//file.delete();
		//dummyFile.renameTo(file);
		
		
		return creditCardList;
	}
	
	
}
