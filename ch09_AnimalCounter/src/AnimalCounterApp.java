import java.util.Scanner;

public class AnimalCounterApp {

	public static void main(String[] args) {
		// Welcome statement
		System.out.println("Animal Counter");
		System.out.println();
		// User input
		Scanner sc = new Scanner (System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Counting alligators...");
			System.out.println();
			Animal a = new Animal();
			a.setCount(2);
			System.out.println();
			System.out.println("Counting sheep...");
			System.out.println();
			// logic
			
			// output
			
			System.out.println("Continue? (y/n) ");
			choice = sc.next();
			System.out.println();
		}
		// bye
		System.out.println("Thanks!");
	}
}
