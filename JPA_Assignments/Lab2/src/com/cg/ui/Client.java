package com.cg.ui;

import java.util.Scanner;
import com.cg.service.BookAuthorService;
import com.cg.service.BookAuthorServiceImpl;

public class Client {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		
		BookAuthorService service=new BookAuthorServiceImpl();
		
		while(true)
		{
			System.out.println("Options \n 1->list of all books \n 2->Books List By author name \n 3->books between prize range \n 4->List of books by author name \nChoose option");
			Scanner scan=new Scanner(System.in);
			int option=scan.nextInt();
			switch(option)
			{
			case 1:
				System.out.println("Books List");
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			}
		}
	}
}
