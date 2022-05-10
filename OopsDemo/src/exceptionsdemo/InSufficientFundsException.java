package exceptionsdemo;

//User-defined exception class

public class InSufficientFundsException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double amount;
	
	public InSufficientFundsException(double amount) {
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

	public static void main(String[] args) {
		
		ThrowsExample t=new ThrowsExample();
	       
        try {
            t.myMethod(1);
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
	}
}
