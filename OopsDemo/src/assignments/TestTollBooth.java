package assignments;

public class TestTollBooth  {

	public static void main(String[] args) {
		
	    TollBooth booth=new AlleghenyTollBooth();
		
	    Truck ford=new TruckFord(5,12000);
		Truck nissan=new TruckNissan(2, 5000);
		Truck daewoo=new TruckDaewoo(6,17000);
		
		booth.displayDetails(5,12000);
		booth.calculateTollDue(5,12000);
		booth.displayData();
		
		booth.displayDetails(2,5000);
		booth.calculateTollDue(2,5000);
		booth.displayData();
		
		booth.displayDetails(6,17000);
		booth.calculateTollDue(6,17000);
		booth.displayData();
		
		
		booth.resetData();
		
    }

}


