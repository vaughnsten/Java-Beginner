package Hello;

public class Length {

	public static void main(String[] args) {
		int a1[] = new int[10];
		int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
		int a3[] = {4, 3, 2, 1};
		
		System.out.println("Length of a1 is " + a1.length);
		System.out.println("Length of a2 is " + a2.length);
		System.out.println("Length of a3 is " + a3.length);
		
//		String[] myStringArray = {"a", "b", "c", "d", "e"};
		
//		System.out.println(myStringArray);
		
		int[] myIntArray = new int[24];
		
		for(int i = 0; i < myIntArray.length; i++) {
			myIntArray[i] = i * 10;
		}
		for(int i = 0; i < myIntArray.length; i++) {
		System.out.println("Element " + i + ", value is " + myIntArray[i]);
		}
		}
	}

