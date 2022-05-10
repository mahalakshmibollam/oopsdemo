package assignments;

//child class of Manager class

public class Employee2 extends Member {
	
	String spec,dept;
	
	public Employee2(String name, int age, int phoneNo, String address, double salary,String s,String d) {
		super(name, age, phoneNo, address, salary);
		this.spec=s;
		this.dept=d;
		
	}

}
