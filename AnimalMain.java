package Hello;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalInheritance animal = new AnimalInheritance("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Kevin", 8, 20, 2, 4, 1, 20, "Furry");
		dog.eat();
		dog.walk();
		dog.run();
	}
}
