package com.author.ui;

import java.util.List;
import java.util.Scanner;

import com.author.entity.Author;
import com.author.service.BookService;
import com.author.service.BookServiceImpl;

public class Client {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		BookService service=new BookServiceImpl();
		
		
		while(true)
		{
			System.out.println("Chosse options:\n 1->Add Author \n 2->Update Author \n 3->Delete Author \n 4->Fetch Author By Id \n 5->Fetch All Author \n 6->Exit");
			Scanner scan=new Scanner(System.in);
			int option = scan.nextInt();
			switch(option)
			{
			case 1:
				Author author=new Author();
				System.out.println("Enter Id");
				int id=scan.nextInt();
				System.out.println("Enter First Name");
				String fname=scan.next();
				System.out.println("Enter Last Name");
				String lname=scan.next();
				System.out.println("Enter mobile number");
				long pNo=scan.nextLong();
				author.setAuthored(id);
				author.setFirstName(fname);
				author.setLastName(lname);
				author.setPhoneNo(pNo);
				service.addAuthor(author);
				break;
			case 2:
				System.out.println("Enter Id to Update");
				int uid=scan.nextInt();
				author=service.getAuthorById(uid);
				System.out.println("Id: "+author.getAuthored());
				System.out.println("FirstName: "+author.getFirstName());
				System.out.println("LastName: "+author.getLastName());
				System.out.println("Phone Number: "+author.getPhoneNo());
				System.out.println("Enter updated First Name");
				String fn=scan.next();
				System.out.println("Enter updated Last Name");
				String ln=scan.next();
				System.out.println("Enter mobile number");
				long pN=scan.nextLong();
				 Author author1=new Author();
				author1.setAuthored(uid);
				author1.setFirstName(fn);
				author1.setLastName(ln);
				author1.setPhoneNo(pN);
				service.updateData(author1);
				break;
			case 3:
				System.out.println("Enter Author Id");
				int did=scan.nextInt();
				service.deleteAuthor(did);
				break;
			case 4:
				System.out.println("Enter Id to Fetch Data");
				int fid=scan.nextInt();
				Author author2=service.fetchById(fid);
				System.out.println("Id: "+author2.getAuthored());
				System.out.println("FirstName: "+author2.getFirstName());
				System.out.println("LastName: "+author2.getLastName());
				System.out.println("Phone Number: "+author2.getPhoneNo());
				break;
			case 5:
				System.out.println("*************Author Details*************");
				List<Author> l=service.fetchAllDetails();
				for(Author aut:l)
				{
				System.out.println("AuthorId "+aut.getAuthored());
				System.out.println("FirstName "+aut.getFirstName());
				System.out.println("LastName "+aut.getLastName());
				System.out.println("PhoneNo "+aut.getPhoneNo());
				}
				break;
			case 6:
				System.exit(option);
				break;
			}
		}
		
	}
}
