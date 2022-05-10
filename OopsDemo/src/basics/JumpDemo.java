package basics;
//Program to demonstrate jump statements - break & continue
public class JumpDemo {
	public static void main(String[] args) {
		int i,j;
	       
        System.out.println("********** Break Demo ***********");
       
        for(i=1;i<=10;i++)
        {
           if(i==6) {
        	   break;//Terminates Loop
           }
            System.out.println(i+" Maha");
        }
        System.out.println("********* Continue Demo **********");
        
        for(j=1;j<=10;j++)
        {
            if(j==6)
            {
                continue; // Skips the current Iteration
            }
            System.out.println(j + " Java");
        }
	}
}
