package ui;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

import business.Reservation;
import util.Console;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		// Welcome
		System.out.println("Reservation Calculator");
		System.out.println();
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		// User input
		while (choice.equalsIgnoreCase("y")) {
			int arrivalMonth = Console.getInt("Enter the arrival month (1-12): ");
			int arrivalDay = Console.getInt("Enter the arrival day (1-31): ");
			int arrivalYear = Console.getInt("Enter the arrival year: ");
			System.out.println();
			int departMonth = Console.getInt("Enter the departure month (1-12): ");
			int departDay = Console.getInt("Enter the departure day (1-31): ");
			int departYear = Console.getInt("Enter the departure year: ");
			// business logic
			double price = 145.00;
			LocalDate arrivalDate = LocalDate.of(arrivalDay, arrivalMonth, arrivalYear);
			LocalDate departDate = LocalDate.of(departMonth,  departDay,  departYear);
			double totalPrice = price * (departDay - arrivalDay);
			
			// output
			System.out.println("Arrival Date: "+arrivalDate);
			System.out.println("Departure Date: "+departDate);
			System.out.println("Price: $145.00 per night");
			System.out.println("Total price: "+totalPrice);
			
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}
		// exit
		System.out.println("Thank you for using the Reservation Calculator!");
	}

}
