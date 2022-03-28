package Basiccommands;

import java.util.Scanner;

public class BookStoreEx {

	//bookname,qty and price.
	
	Scanner a = new Scanner(System.in);
	static String collegename;
	String bookname;
	int qty;
	float price;
	float discount;
	void input() {
		
		System.out.println("Enter collegename bookname  qty price");
		collegename=a.next();
		bookname=a.next();
		qty=a.nextInt();
		price=a.nextFloat();
	}


	void display() {
		
		System.out.println(collegename+ "  " +bookname+ "  " +qty+  " " +price+ " " );
		
	}
	public static void main(String[] args) {

		BookStoreEx e= new BookStoreEx ();
		
		e.input();
		e.display();
		

	}

}
