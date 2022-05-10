package assignments;
import java.util.Scanner;
/*
 * Program to perform sum, product, difference and division
 */
public class Question3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,sum,product,difference;
		float division;
		System.out.println("Enter two integers : ");
		a=s.nextInt();
		b=s.nextInt();
		sum=a+b;
		System.out.println("Sum of "+a+" and "+b+" is : "+sum);
		product=a*b;
		System.out.println("Product of "+a+" and "+b+" is : "+product);
		difference=a-b;
		System.out.println("Difference of "+a+" and "+b+" is : "+difference);
		division=a/b;
		System.out.println("Division of "+a+" and "+b+" is : "+division);
	}
}
