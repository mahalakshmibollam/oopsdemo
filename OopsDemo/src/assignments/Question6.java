package assignments;
import java.util.Scanner;
/*
 * Program to find Area of a Rectangle
 */
public class Question6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double l, b;
		System.out.println("Enter length of the rectangle : ");
		l=s.nextDouble();
		System.out.println("Enter breadth of the rectangle : ");
		b=s.nextDouble();
		System.out.println("Area of the Rectangle is : "+(int)l*b);
	}
}