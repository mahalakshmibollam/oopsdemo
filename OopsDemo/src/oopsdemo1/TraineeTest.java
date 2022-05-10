package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		
		Trainee t1=new Trainee();
		t1.display();
		
		Trainee t2=new Trainee(202,"Jhonson","Python",3000);
		t2.display();
		
		Trainee t3=new Trainee(402,"Lewis","Ruby",30000);
		t3.display();
	}

}
