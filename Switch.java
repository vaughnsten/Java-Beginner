package Hello;

public class Switch {

	public static void main(String[] args) {
	char bar = 'B';
	
	switch(bar) {
	case 'A':
		System.out.println("A");
		break;
	case 'B':
		System.out.println("B");
		break;
	case 'C':
		System.out.println("C");
		break;
	case 'D':
		System.out.println("D");
		break;
	case 'E':
		System.out.println("E");
		break;
	default:
		System.out.println("Not found");
		break;
	}
}
}