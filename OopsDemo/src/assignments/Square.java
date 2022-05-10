package assignments;

//sub class of Rectangle2 class

public class Square extends Rectangle2 {

	public Square(int length, int breadth) {
		super(length, breadth);
		
	}
	
	void printArea() {
		area=length*breadth;
		System.out.println("Area of the Square : "+area);
	}
	
	void printPerimeter() {
		perimeter=area/2;
		System.out.println("Perimeter of the Square : "+perimeter);
	}
	
}
