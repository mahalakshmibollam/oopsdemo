package oopsdemo2;

public class OverlaodDemo {

	public static void main(String[] args) {
		
		Addition a1=new Addition();
		
		//invoking add() overload method
		a1.add();
		a1.add(40, 80);
		a1.add(45.69f, 546.42f);  //type promotion
		a1.add(123, 456, 32);
		a1.add("Shin", "chan");

	}

}
