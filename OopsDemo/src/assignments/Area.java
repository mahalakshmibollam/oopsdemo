package assignments;

import java.util.Scanner;

/*
 * Program to print the area of a rectangle by creating a class named area taking the values
 * of its length and breadth as parameters of its method and having a method named returnArea
 * which returns the area of the rectangle. length and breadth of rectangle are entered through keyboard.
 * 
 */

class AreaTest {
	
	private double length,breadth,area;
	Scanner s=new Scanner(System.in);

	public double returnArea() {
		System.out.println("Enter Length of the rectangle : ");
		length=s.nextDouble();
		System.out.println("Enter Breadth of the rectangle : ");
		breadth=s.nextDouble();
		
		area=length*breadth;
		System.out.println("Area of the Rectangle : "+area);
		return area;
	}
	
}
public class Area {

	public static void main(String[] args) {
		
		AreaTest a=new AreaTest();
		
		a.returnArea();

	}

}
