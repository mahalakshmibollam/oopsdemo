package oopsdemo3;

//Rectangle class is implementing IShape Interface

public class Rectangle implements IShape {
	
	private double width;
    private double height;
    
    //generate constructor with fields
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");

	}

	@Override
	public double getArea() {
		return this.height*this.width;
	}

}
