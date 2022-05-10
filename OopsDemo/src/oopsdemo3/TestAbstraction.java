package oopsdemo3;

public class TestAbstraction {

	public static void main(String[] args) {
		
		Bike b1=new Honda();  //up casting
		
		b1.run();
		b1.changeGear();

	}

}
