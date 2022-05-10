package basics;
//Program to find sum of natural numbers from 1 to 100
public class ForDemo1 {
	public static void main(String[] args) {
		int i,n=100,sum=0;
		for(i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("The Sum : "+sum);
	}
}
