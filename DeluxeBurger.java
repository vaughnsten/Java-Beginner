package OOPMasterChallenge;

public class DeluxeBurger extends Hamburger {

	public DeluxeBurger() {
		super("Deluxe", "Sausage & Bacon", 14.54, "White");
		super.addHamburgerAddition1("Chips", 2.75);
		super.addHamburgerAddition2("Drink", 1.81);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		// TODO Auto-generated method stub
		System.out.println("Cannot add additional items to a deluxe burger");
	}

	
}
