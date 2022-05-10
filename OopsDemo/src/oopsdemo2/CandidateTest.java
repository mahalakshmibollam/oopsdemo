package oopsdemo2;

public class CandidateTest {

	public static void main(String[] args) {
		
		System.out.println("************** Candidate Details **************");
		
		JavaCandidate jc1=new JavaCandidate(1357,"James Gosling",5000,"Hibernate");
        jc1.display();
        jc1.getPerks();
        
        AccountsCandidate ac1=new AccountsCandidate(2468,"Mike John",3000);
        ac1.display();
        ac1.getPerks();
	}

}
