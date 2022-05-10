package oopsdemo2;

public class AggregationDemo {

	public static void main(String[] args) {
		
		Address ad1=new Address("Hyderabad","Telangana","India",533100);
		Address ad2=new Address("Benguluru","Karnataka","India",533201);
		
		Student s1=new Student(156,"Mike",ad1);
		Student s2=new Student(197,"John",ad2);
		
		s1.display();
		s2.display();

	}

}
