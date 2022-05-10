package assignments;

/*
 * Program to perform inheritance 
 * 
 *          Member
 *    Employee    Manager
 */

public class Member {
	
	private String name,address;
	private int age,phoneNo;
	private double salary;
	
	public Member(String name, int age, int phoneNo, String address, double salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}

	void printSalary() {
		
		System.out.println("Salary of "+name+" is : "+this.salary);
	}

}
