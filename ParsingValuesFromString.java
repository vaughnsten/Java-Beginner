package Hello;

public class ParsingValuesFromString {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("Number as String =" + numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println("Number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println("Number as String = " + numberAsString);
		System.out.println("Number = " + number);
	}
}
