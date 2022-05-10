package oopsdemo1;

//Program to demonstrate Constructors

public class Trainee {
	
	private int id;
    private String name,tech;
    private double stipend;
	public Trainee() {
		System.out.println("Implicit Constructor");
		this.id=111;
		this.name="James Gosling";
		this.tech="Java";
		this.stipend=5000;
		
	}
	public Trainee(int id, String name, String tech, double stipend) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
    void display() {
    	System.out.println("************** Trainee Details ****************");
    	System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
    	System.out.println("-----------------------------------------------");
    }
}