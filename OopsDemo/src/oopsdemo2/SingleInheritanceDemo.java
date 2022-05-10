package oopsdemo2;

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Developer d1=new Developer(101,"Shinchan","Sony");   //invokes derived class constructor
		Developer d2=new Developer(102,"Heidi","Kushi");
		
		d1.display();  //child class object invokes parent class method
		d1.display1(); //child class object invokes child class method
		
		d2.display();
		d2.display1();
	}

}
