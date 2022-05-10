package assignments;

public class TruckFord implements Truck {
	
	  int axles;
	  int weight;
	  
	public TruckFord(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}

	public int getAxle() {
		return axles;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public void displayDetails(int axles, int weight) {
		// TODO Auto-generated method stub
		
	}

	
	
}
