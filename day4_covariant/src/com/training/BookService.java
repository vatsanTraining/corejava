package com.training;
import java.util.*;

public class BookService {
	Book booklist[]=new Book[10];
	Scanner scan=new Scanner(System.in);
		
		public void getBookService() {
			
//			System.out.println("Enter the details 1.id 2.name 3.author 4.price");
			System.out.print("1.add 2.getone 3.getAll");
			int choice=scan.nextInt();
			switch (choice) {
			case 1:try {
					addbook();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			case 2:getone();
					break;
			case 3:getAll();
					break;

			default:
				System.exit(0);
			}
			
			}
		
		
		public void addbook() throws Exception {
			
			int length=booklist.length;
			(booklist[length]).setBookId(101);
			(booklist[length]).setBookName("abc");
			(booklist[length]).setAuthorName("xyz");
			(booklist[length]).setPrice(505);
			
		}
		
		public void getone()throws NoSuchElementException {
			if(booklist[0]==null) {
				throw new NoSuchElementException();
			}
			else 
				
				{
					booklist[0].toString();
					System.out.println();
				}
			
		}
		
		public void getAll() {
			if(booklist[0]==null) {
				throw new NoSuchElementException();
			}
			else {
				for(int i=0;i<booklist.length;i++)
				{
					booklist[i].toString();
					System.out.println();
				}
			}
			
		}
		
}
