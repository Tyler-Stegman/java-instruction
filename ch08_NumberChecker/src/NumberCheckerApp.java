import java.util.Scanner;

public class NumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Odd/Even Checker!");
		System.out.println();
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer: ");
			//String integer = sc.nextLine();
			Integer i = Console_NotStatic.getString(integer);
            if (i % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
		}
		System.out.println("Thank you for using Number Checker!");
	}

}
