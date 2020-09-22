package com.training.service;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    		public synchronized void writeToFile(String stringToWrite,File file)
    		{
    			FileWriter fw=null;
    			try {
					fw=new FileWriter(file);
					fw.write(stringToWrite);
					notify();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
    			finally {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
    		}
    		public synchronized void readFromFile(File file)
    		{
    			FileReader fr=null;
    			try {
    				
					fr=new FileReader(file);
					if(file.length()==0) {
						wait();
					}
					int i;
					while((i=fr.read())!=-1) {
						System.out.print((char)i);
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
    			finally {
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
    		}
}
