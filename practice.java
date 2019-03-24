package Hello;

public class practice {

	public static void main(String[] args)
    {
        //String hi = "Hello World";
        //System.out.println(hi);

        float result = 4 + 2;

        System.out.println("4 + 2 = " + result);

        float previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;

        result = (result * 10 - 2) / 5;
        System.out.println(previousResult + " * 10 - 2 / 5 = " + result);

        if (result <= 10)
        {
            System.out.println("The result is equals or less than to 10");
        }
        else
        {
            System.out.println("The data is wrong");
        }
    }
}
