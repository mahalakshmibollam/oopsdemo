package assignments;

/*
 * Program to print the area of two rectangles having sides (4,5) and (5,8)
 *     respectively.By creating a class named Rectangle 
 *     with a method named Area 
 *   which returns the area, length and breadth passed as
 *    parameters to its constructor.
 */

class RectangleArea {
	
	private int length,breadth,area;
	
	public RectangleArea(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	public void area() {
		area=length*breadth;
		System.out.println("Area of the Rectangle with sides  "+length+","+breadth+" is : "+area);
		
	}

}

public class Rectangle {

	public static void main(String[] args) {
		
		RectangleArea a1=new RectangleArea(4, 5);
		RectangleArea a2=new RectangleArea(5, 8);
		
		a1.area();
		a2.area();

	}

}
