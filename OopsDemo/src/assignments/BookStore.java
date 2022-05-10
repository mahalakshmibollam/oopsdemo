package assignments;

//OOP Program to enter Book details & display it.

import java.util.Scanner;

//instance class

class Book1 {
	
	// define properties/state/variables
	String title;
	String author;
	int year;
	String publisher;
	int price;
	
	Scanner s=new Scanner(System.in);
	
	//instance methods
	public void inputDetails() {
		System.out.println("Enter Title of the Book : ");
		title=s.nextLine();
		System.out.println("Enter Author of the Book : ");
		author=s.nextLine();
		System.out.println("Enter Year of the Book : ");
		year=s.nextInt();
		System.out.println("Enter Publisher of the Book : ");
		publisher=s.next();
		System.out.println("Enter Price of the Book : ");
		price=s.nextInt();
	}
	public void displayDetails() {
		System.out.println("Enter Title of the Book : "+title);
		System.out.println("Enter Author of the Book : "+author);
		System.out.println("Enter Year of the Book : "+year);
		System.out.println("Enter Publisher of the Book : "+publisher);
		System.out.println("Enter Price of the Book : "+price);
	}
}

