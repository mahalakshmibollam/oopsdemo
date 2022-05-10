package assignments;

/*
 * Program to 
 * 
 * 
 */

public class Rectangle2 {
	
	protected int length;
	protected int breadth;
	protected double area;
	protected double perimeter;
	
	

	public Rectangle2(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void printArea() {
		area=length*breadth;
		System.out.println("Area of the Rectangle : "+area);
	}
	
	void printPerimeter( ) {
		perimeter=area/2;
		System.out.println("Perimeter of the Rectangle : "+perimeter);
	}
	
}
