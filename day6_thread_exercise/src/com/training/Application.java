package com.training;

import java.io.File;

import com.training.service.FileOperation;

public class Application {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		FileOperation fo=new FileOperation();
		File file=new File("myFile.txt");
		new Thread(){  
			public void run(){fo.readFromFile(file);}  
			}.start();  
			
		
		new Thread(){  
			public void run(){fo.writeToFile("hello everyone",file);}  
			}.start();  
			
	}

}
