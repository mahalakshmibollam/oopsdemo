package assignments;

/*
 * Program to create a class named Employee1 
 *    having some methods and
 *    print the final salary.
 */

class EmployeeSalary {
	
	private double salary;
	private double noOfHours;
	
	
	public void getInfo(double s,double n) {
		this.salary=s;
		this.noOfHours=n;
		System.out.println("Employee Basic Salary : "+s);
		System.out.println("Employee Working Hours Per Day : "+n);
		
	}
	
	public void addSal() {
		if(salary<500*76.29) {
			salary=salary+10*76.29;
			System.out.println("Employee Final Salary : "+salary);
		}
	}
	
	public void addWork() {
		if(noOfHours>6) {
			salary+=5*76.29;
			System.out.println("Employee Final Salary : "+salary);
		}
	}
		
}

public class Employee1 {
	public static void main(String[] args) {
		
		EmployeeSalary e1=new EmployeeSalary();
		
		e1.getInfo(40000.0, 8.0);
		e1.addSal();
		e1.addWork();
		

		
	}
}

