
public class DiceRollerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Dice Roller!");
		// Get User Input - Roll Die? : 'Y' or 'y' to continue
		String choice = Console.getString("Roll the dice? (y/n)");

		while (choice.equalsIgnoreCase("y")) {
			// biz logic: Sum the dice
			Dice d = new Dice();
			// generate random values
			d.roll();
			// Display results: Display Total, special Msg
			d.printRoll();

			choice = Console.getString("Roll again? (y/n)");
		}

		// Bye
		System.out.println("Bye!");
	}

}
