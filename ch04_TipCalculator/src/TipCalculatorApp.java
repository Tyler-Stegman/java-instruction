import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Tip Calculator!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.print("Cost of meal: ");
		BigDecimal cost = sc.nextBigDecimal();
		while (choice.equalsIgnoreCase("y")) {
			final BigDecimal tip = new BigDecimal("0.15");
			BigDecimal tipAmount = cost.multiply(tip).setScale(2, RoundingMode.HALF_UP);
			System.out.println();
			System.out.println("Tip amount (15%): " + tipAmount);
			BigDecimal totalAmount = tipAmount.add(cost);
			System.out.println();
			System.out.println("Total amount due " + totalAmount);
			System.out.println();
			break;

		}
		while (choice.equalsIgnoreCase("y")) {
			final BigDecimal tip2 = new BigDecimal(".20");
			BigDecimal tipAmount2 = cost.multiply(tip2).setScale(2, RoundingMode.HALF_UP);
			System.out.println();
			System.out.println("Tip amount (20%): " + tipAmount2);
			BigDecimal totalAmount2 = tipAmount2.add(cost);
			System.out.println();
			System.out.println("Total amount due " + totalAmount2);
			System.out.println();
			break;
			
		}
		while (choice.equalsIgnoreCase("y")) {
			final BigDecimal tip3 = new BigDecimal(".25");
			BigDecimal tipAmount3 = cost.multiply(tip3).setScale(2, RoundingMode.HALF_UP);
			System.out.println();
			System.out.println("Tip amount (25%): " + tipAmount3);
			BigDecimal totalAmount3 = tipAmount3.add(cost);
			System.out.println();
			System.out.println("Total amount due " + totalAmount3);
			System.out.println();
			break;
		}
		System.out.println("Thanks!");
		sc.close();

	}

}
