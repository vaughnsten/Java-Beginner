package HelloPractice;

class VehicleDemo {

	int passengers;
	int fuelcap;
	int mpg;
}

class Vehicle {
	public static void main(String[] args) {
		VehicleDemo minivan = new VehicleDemo();
		int range;
		
		minivan.passengers = 7;
		minivan.fuelcap = 12;
		minivan.mpg = 19;
		
		range = minivan.fuelcap * minivan.mpg;
		
		System.out.println("The minivan can carry " + minivan.passengers + " with a range of " + range);
	}
}