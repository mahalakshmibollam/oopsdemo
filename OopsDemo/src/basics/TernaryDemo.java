package basics;
/*
 * 
 */
public class TernaryDemo {
	public static void main(String[] args) {
		int a=180,b=250,max;
		System.out.println("First Number is :"+a);
		System.out.println("Second Number is :"+b);
		max=(a>b)?a:b;
		String msg=(a>b)?"A is Greatest":"B is Greatest";
		System.out.println("The Maximum of Two Numbers is :"+max+" ."+msg);
	}
}
