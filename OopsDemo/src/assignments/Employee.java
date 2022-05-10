package assignments;

import java.util.Scanner;

/*
 * Program to print the information name,year of joining,salary and address
 * of three employees by creating a class named Employee
 * The output should be as follows:
 * 
 * Name     Year of joining    Address
 * Robert     1994            64C-WallsStreet
 * Sam        2000            68D-WallsStreet
 * John       1999            26B-WallsStreet
 * 
 */

class EmployeeTest {
	
	private String name,address;
	private int year;
	private double salary;
	Scanner s=new Scanner(System.in);
	
	void inputDetails() {
		System.out.println("Enter Name, Year of joining, Address : ");
		name=s.next();
		year=s.nextInt();
		address=s.next();
		System.out.println("Enter Employee Salary : ");
		salary=s.nextDouble();
	}
	
	void displayDetails() {
		System.out.println("Name\t\tYear of joining\t\tAddress");
		System.out.println(name+"\t\t"+"\t"+year+"\t\t"+address);
	}
}

public class Employee {
	public static void main(String[] args) {
		
		EmployeeTest e1=new EmployeeTest();
		EmployeeTest e2=new EmployeeTest();
		EmployeeTest e3=new EmployeeTest();
		
		e1.inputDetails();
		e2.inputDetails();
		e3.inputDetails();
		
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();

	}
}
