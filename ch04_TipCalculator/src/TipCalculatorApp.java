import java.math.BigDecimal;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Tip Calculator");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Cost of meal: ");
			String cost = sc.next();
			System.out.println();
			System.out.println("15%");
			System.out.println();
			System.out.println("Tip amount: ");
			BigDecimal tip = new BigDecimal(sc.nextDouble());
			
		}
		//System.out.println("15%");
		//System.out.println();
		//System.out.println("Tip amount: "+cost * .15);
		//System.out.println("Total amount: "+ (cost + (cost * .15)));
		

		}

	}
