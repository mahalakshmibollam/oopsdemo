package assignments;

/*
 * Program to generate following output
 * 
 * 5 4 3 2 1
 * 5 4 3 2
 * 5 4 3
 * 5 4
 * 5
 * 
 */

public class PatternProgram1 {

	public static void main(String[] args) {
		int i,j,n=5; // variable declaration
		for(i=1;i<=n;i++) {
			System.out.println();
			for(j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
		}
	}

}
