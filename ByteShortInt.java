package Hello;

public class ByteShortInt {

    public static void main(String[] args) {

    	/*
        // int has a width of 32
        int myMinValue = -2147483648;
	    int myMaxValue = 2147483647;
	    int myTotal = (myMinValue/2);
        System.out.println("MyTotal = " + myTotal);

	    //byte has a width of 8
	    byte myByteValue = -128;
	    byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("MyByteValue = " + myByteValue);

	    //short has a width of 16
	    short myShortValue = 21867;
	    short myNewShortValue = (short)(myShortValue/2);
        System.out.println("MyNewShortValue = " + myNewShortValue);

	    //long has a width of 64
	    long myLongValue = 9223272036854775807L;
	    long myNewLongValue = (myLongValue/2);
        System.out.println("MyNewLongValue = " +myNewLongValue);
*/

    	byte newByte = 12;
    	short newShort = 218;
    	int newInt = 2147;
    	long newLong = 50000L + 10L * (newByte + newShort + newInt);
		System.out.println("The value of Long is " + newLong);

    }
}
