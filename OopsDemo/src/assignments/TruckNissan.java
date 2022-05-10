package assignments;

public class TruckNissan extends TruckFord implements Truck {
	
	
	public TruckNissan(int axles, int weight) {
		super(axles, weight);
		// TODO Auto-generated constructor stub
	}

	public int getAxle() {
		return axles;
	}

	public int getWeight() {
		return weight;
	}
}
class TruckDaewoo extends TruckFord implements Truck {

	public TruckDaewoo(int axles, int weight) {
		super(axles, weight);
		// TODO Auto-generated constructor stub
	}
	
}
