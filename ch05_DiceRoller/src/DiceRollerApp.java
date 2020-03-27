import java.util.Scanner;

public class DiceRollerApp {

	private static String askToContinue(Scanner sc) {
		System.out.print("Roll again? (y/n): "+"\n");
		String choice = sc.next();
		return choice;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller App!" + "\n");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		System.out.println("Roll the dice? (y/n): ");
		choice = sc.next();
		System.out.println();
		while (choice.equalsIgnoreCase("y")) {
			int roll1;
			int roll2;
			roll1 = (int) (Math.random() * 6) + 1;
			System.out.println("Die 1: " + roll1);
			roll2 = (int) (Math.random() * 6) + 1;
			System.out.println("Die 2: " + roll2 + "\n");
			if ((int) roll1 + (int) roll2 <= 2) {
				System.out.println("Snake Eyes!");
			}
			if ((int) roll1 + (int) roll2 >= 12) {
				System.out.println("Box Cars!");
			}
			choice = askToContinue(sc);

		}
		System.out.println("Bye!");
	}

}
