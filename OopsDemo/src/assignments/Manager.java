package assignments;

//child class of Member class 

class Manager extends Member {
	
	String spec,dept;
	
	public Manager(String name, int age, int phoneNo, String address, double salary,String s,String d) {
		super(name, age, phoneNo, address, salary);
		this.spec=s;
		this.dept=d;
	}
	
}


