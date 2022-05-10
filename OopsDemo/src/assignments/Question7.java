package assignments;
import java.util.Scanner;
/*
 * Program to calculate total marks and percentage 
 */
public class Question7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int english, hindi, maths, total;
		int percentage;
		System.out.println("Enter three subjects marks of Robert : ");
		english=s.nextInt();
		hindi=s.nextInt();
	    maths=s.nextInt();
	    total=english+hindi+maths;
	    System.out.println("Robert's total marks : "+total);
	    percentage=total*100/300;
	    System.out.println("His percentage : "+percentage);
	}
}
