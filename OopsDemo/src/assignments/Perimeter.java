package assignments;

//main class of both Rectangle2 and Square classes

public class Perimeter {

	public static void main(String[] args) {
		
		Rectangle2 r=new Rectangle2(25, 40);
		Square s=new Square(5, 8);
		
		r.printArea();
		r.printPerimeter();
		
		s.printArea();
		s.printPerimeter();

	}

}
