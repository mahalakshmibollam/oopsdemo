package assignments;
/*
 * * Program to generate following output
 * 
 *          *
 *        * * *
 *     * * * * * *
 *    * * * * * * *
 *     * * * * * *
 *        * * *
 *          *
 */

public class PatternProgram2 {
	
	public static void main(String[] args) {
		
			int i,j,n=7,m=1;    // variable declaration & initialization.
		
			for(i=1;i<=n;i++) {
				if(i==2||i==4||i==5) {
					continue;   //skips the execution of current iteration & control jumps to the beginning of next iteration.
				}
				for(j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {
					System.out.print(" "+"*");
				}
				System.out.println();
			}
			for(i=7;i>=m;i--) {
				if(i==7||i==5||i==4||i==2) {
					continue;
				}
				for(j=1;j<=n-i;j++) {
					System.out.print(" ");
				}
				for(j=1;j<=i;j++) {
					System.out.print(" "+"*");
				}
				System.out.println();
			}
	}
}