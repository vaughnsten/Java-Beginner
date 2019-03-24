package Hello;

import static java.lang.System.out;

public class Menu {

	public static void main(String[] args) 
		throws java.io.IOException {
			char choice;
			
			do {
				out.println("Help on: ");
				out.println("  1. if");
				out.println("  2. switch");
				out.println("  3. while");
				out.println("  4. do-while");
				out.println("  5. for\n");
				out.println("Choose one: ");
				choice = (char) System.in.read();
			} while( choice < '1' || choice > '5');
			
			out.println("\n");
			
			switch(choice) {
			case '1':
				out.println("The if:\n");
				out.println("if(condition) statement;");
				out.println("else statement;");
				break;
			case '2':
				out.println("The switch:\n");
				out.println("switch(expression) {");
				out.println(" case constant:");
				out.println("   statement sequence");
				out.println("   break;");
				out.println(" //...");
				out.println("}");
				break;
			case '3':
				out.println("The while:\n");
				out.println("while(condition) statement;");
				break;
			case '4':
				out.println("The do-while:\n");
				out.println("do {");
				out.println("  statement;");
				out.println("} while (condition);");
				break;
			case '5':
				out.println("The for:\n");
				out.println("for(init; condition; iteration)");
				out.println("  statement;");
				break;
			}
		}
	
}
