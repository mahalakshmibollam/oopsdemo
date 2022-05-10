package assignments;

//Program to create a room class, the attributes of this class is roomno, roomtype, roomarea and acmachine.
//In this class the member functions are setdata and displaydata.

public class Room {
	
	//attributes
	int roomNo;
	String roomType;
	float roomArea;
	boolean acMachine;
	
	//instance methods
	void setData() {
		System.out.println("************* Room Details ************");
		roomNo=224;
		roomType="Deluxe";
		roomArea=340;
		acMachine=true;
		
	}
	
	void displayData() {
		System.out.println("Room Number :"+roomNo);
		System.out.println("Room Type :"+roomType);
		System.out.println("Room Area :"+roomArea);
		System.out.println("AC Machine :"+acMachine);
		System.out.println("-------------------------------------");
	}
	public static void main(String[] args) {
		
		//object creation
		Room r1=new Room();
		
		//instance methods
		r1.setData();
		r1.displayData();
	}
}
