package OOPMasterChallenge;

public class Main {

	public static void main(String[] args) {
	Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
	double price = hamburger.itemizeHamburger();
	hamburger.addHamburgerAddition1("Tomato", .27);
	hamburger.addHamburgerAddition2("Lettuce", .75);
	hamburger.addHamburgerAddition3("Cheese", 1.12);
	System.out.println("Total burger price is " + price);
	
	HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
	healthyBurger.addHeathyAddition1("Egg", 5.43);
	healthyBurger.addHeathyAddition2("Lentils", 5.43);
	System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

	DeluxeBurger db = new DeluxeBurger();
	db.itemizeHamburger();
	}
}
