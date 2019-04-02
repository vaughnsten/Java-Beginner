package HelloPractice;

class AnimalAttributes {
	int speed;
	int time;
	int distance;
	
	int run() {
		return speed = distance / time;
	}
	
	double velocity(int race) {
		return race = speed * distance;
	}
}

class animals {

	public static void main(String[] args) {
		AnimalAttributes cheetah = new AnimalAttributes();
		
		cheetah.speed = 100;
		cheetah.time = 5;
		cheetah.distance = 13;
		
		int fast = cheetah.run();
		
		double outrun = cheetah.velocity(0);
		
		System.out.println("Cheetah can run " + fast + " with the velocity of " + outrun + "kph.");
	}
}


