package basics;
/*
 * Program to display numbers from 1 to 10.
 *
 * Understand the concept of Loop.
 * Loop - A set of statements executing repeatedly , until a particular
 * condition is TRUE.
 */
public class WhileDemo1 {
	public static void main(String[] args) {
		int i=10;//loop initialization

		while(i>=1) { //set condition
			System.out.println(i+" Maha");
			i=i-1;
		}
		System.out.println("Exiting the Loop.....");
	}
}
