import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Change Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter number of cents (0-99): ");
			int cents = sc.nextInt();
			System.out.println();
			
		while (cents > 0) {
			if (cents >= 25) {
				System.out.println("Quarter");
				cents -= 25;
			}
			else if (cents >= 10) {
				System.out.println("Dime");
				cents -= 10;
			}
			else if (cents >= 5) {
				System.out.println("Nickle");
				cents -= 5;
			}
			else if (cents >= 1) {
				System.out.println("Penny");
				cents -= 1;
			}
		}
			
			System.out.println();
			System.out.println("Continue? (y/n) ");
			choice = sc.next();
			
			
			
		}

	}

}
