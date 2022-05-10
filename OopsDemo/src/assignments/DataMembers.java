package assignments;

public class DataMembers {

	public static void main(String[] args) {
		
		Employee2 e=new Employee2("Monu", 15, 8000899, "Kolkata", 50000.0, "Dentist", "Dental");
		Manager m=new Manager("Sonu", 18, 7899098, "Mysore", 80000.0, "cardialogist", "Cardialogy");
		
		e.printSalary();
		m.printSalary();

	}

}
