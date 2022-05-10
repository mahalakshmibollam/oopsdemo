package assignments;
import java.util.Scanner;
/*
 * Program to find sum, average, product, smallest, 
 * and largest of three numbers
 */
public class Question4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,z,sum,product,small,large;
		float avg;
		System.out.println("Enter three integers : ");
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		sum=x+y+z;
		System.out.println("Sum of "+x+", "+y+" and "+z+" are : "+sum);
		avg=sum/3;
		System.out.println("Average of "+x+", "+y+" and "+z+" are : "+avg);
		product=x*y*z;
		System.out.println("Product of "+x+", "+y+" and "+z+" are : "+product);
		small=(x<y)?((x<z)?x:z):((y<z)?y:z);
		System.out.println("Smallest of "+x+", "+y+" and "+z+" are : "+small);
		large=(x>y)?((x>z)?x:z):((y>z)?y:z);
		System.out.println("Largest of "+x+", "+y+" and "+z+" are : "+large);
	}
}
