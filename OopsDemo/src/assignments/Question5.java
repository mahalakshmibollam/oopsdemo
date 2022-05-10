package assignments;

import java.util.Scanner;

/*
 * Program to determine whether the first is a multiple of the second or not
 */
public class Question5 {
	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two integers : ");
		i=s.nextInt();
		j=s.nextInt();
		if(i%j==0) {
			System.out.println("Multiple");
		} else {
			System.out.println("Not Multiple");
		}
	}
}
