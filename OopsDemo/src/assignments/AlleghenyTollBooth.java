package assignments;

public  class AlleghenyTollBooth  implements TollBooth {
	
	public int noOfTrucks;
	public int totalReceipts;
	private int axles;
	private int weight;
	private int tollDue;

	
	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public int getTotalReceipts() {
		return totalReceipts;
	}

	public int getAxles() {
		return axles;
	}

	public int getWeight() {
		return weight;
	}

	public int getTollDue() {
		return tollDue;
	}

	public void displayDetails(int axles,int weight) {
		System.out.println("*********** Truck Details ************");
		System.out.println("Truck arrival - axles : "+axles);
		System.out.println("Truck's  weight : "+weight);
	}

	@Override
	public void resetData() {
		
		System.out.println("Toll Data will be resetted.");
	}

	public void calculateTollDue(int axles, int weight) {
		
		System.out.println("*********** Toll Due Details ************");
		tollDue=5*axles+10*(weight/1000);
		System.out.println("Toll Due of Truck is : $"+tollDue);
			
	}

	@Override
	public void displayData() {
		
		totalReceipts+=tollDue;
		noOfTrucks+=1;
		System.out.println("*********** Collecting Receipts ***********");
		System.out.println("Total Receipts since last collection : $"+totalReceipts);
		System.out.println("Number of Trucks passed : "+noOfTrucks);
	}

	
}
