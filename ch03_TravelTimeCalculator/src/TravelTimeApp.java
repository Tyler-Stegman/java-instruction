import java.util.Scanner;

public class TravelTimeApp {

	public static void main(String[] args) {
		// 1. Welcome message

		System.out.println("Welcome to the travel time calculator!");
		Scanner sc = new Scanner(System.in);

		String choice = "y";

		// --Start Loop

		while (choice.equalsIgnoreCase("y")) {
			// 2. Prompt for user input: miles and mph
			System.out.print("Enter miles: ");
			double miles = sc.nextDouble();
			System.out.println("Enter mph: ");
			double mph = sc.nextDouble();

			double minutesTraveled = (miles/mph)*60;
			int timeTraveledHours = (int)(minutesTraveled/60);
			int remainingMinutes = (int)(minutesTraveled%60);

			// 4. Display output: display hours and minutes
			System.out.println("Estimated Travel Time");
			System.out.println("------------------");
			System.out.println("Hours: "+timeTraveledHours);
			System.out.println("Minutes: "+remainingMinutes);
			System.out.println();
			System.out.print("Continue? (y/n)");
			choice = sc.next();

		}
		// -- End Loop
		// 5. Bye

		System.out.println("Bye");

	}

}
