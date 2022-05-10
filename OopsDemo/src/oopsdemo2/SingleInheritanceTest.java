package oopsdemo2;

class Animal {  //parent/base/super class
	
	String name;  //properties
	
	public void eat() {  //methods
		System.out.println("I can Eat");
	}
}
//inherited from Animal class
//child/sub/derived class
class Dog extends Animal {
	
	public void display() {
		System.out.println("My name is : "+name);
	}
	
}
public class SingleInheritanceTest {

	public static void main(String[] args) {
		
		//create & intialize object of sub class
		Dog labrador=new Dog();
		
		//access field of super class
		labrador.name="Leopard";
		
		//call method of derived class
		labrador.display();
		
		//call method of super class
		labrador.eat();
		
	}

}
