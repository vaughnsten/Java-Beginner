package Hello;

import static java.lang.System.out;

public class DayOfTheWeekChallenge {

	public static void main(String[] args) {
		
		printDayOfTheWeek(1);
	}
	
	public static void printDayOfTheWeek(int day) {
		switch(day) {
		case 0:
			out.println("Sunday");
			break;
		case 1:
			out.println("Monday");
			break;
		case 2:
			out.println("Tuesday");
			break;
		case 3:
			out.println("Wednesday");
			break;
		case 4:
			out.println("Thursday");
			break;
		case 5:
			out.println("Friday");
			break;
		case 6:
			out.println("Saturday");
			break;
		default:
			out.println("Invalid day");
			break;
		}
		
		if(day == 0) {
			out.println("Sunday");
		}
		else if(day == 1) {
			out.println("Monday");
		}
		else if(day == 2) {
			out.println("Tuesday");
		}
		else if(day == 3) {
			out.println("Wednesday");
		}
		else if(day == 4) {
			out.println("Thursday");
		}
		else if(day == 5) {
			out.println("Friday");
		}
		else if(day == 6) {
			out.println("Saturday");
		}
		else {
			out.println("Invalid day");
		}
	}
}
