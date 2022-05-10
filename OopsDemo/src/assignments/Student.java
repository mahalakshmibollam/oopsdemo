package assignments;

public class Student {
	
	//properties
	String name;
	public Student() {   ////implicit / no-arg constructor
		System.out.println("Unknown");
	}

	public Student(String name) {   //parameterized / one-arg constructor
		this.name = name;
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		//create an object with Student class
		Student s1=new Student("Shinchan");
		Student s2=new Student();
		Student s3=new Student("Heidi");
		Student s4=new Student("Doramon");
		Student s5=new Student();
	}
	
}
