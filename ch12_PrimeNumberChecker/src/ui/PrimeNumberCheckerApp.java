package ui;

import java.util.Scanner;

import util.Console;

public class PrimeNumberCheckerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Prime Number Checker App!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			int num = Console.getInt("Please enter an integer between 1 and 5000: ");
			int i;
			if (num < 1 || num > 5000) {
				System.out.println("Error! Integer must be between 1 and 5000");
				continue;
			}
			boolean composite = false;
			boolean prime = true;
			if (num >= 1 || num <= 5000) {
				for (i = 2; i <= num / 2; ++i) {
					if (num % i == 0) {
						composite = true;
						break;
					}
				}
				if (!composite) {
					Console.displayLine(num + " is a prime number.");
					continue;
				}
				if (num >= 1 || num <= 5000) {
					for (i = 2; i <= num / 2; ++i) {
						if (num % i == 0) {
							prime = false;
							break;
						}
					}
					if (!prime) {
						Console.displayLine(num + " is a composite number.");
					}
					if (num >= 1 || num <= 5000) {
						int number = num;
						System.out.println("The Factors of " + number + " are: ");
						for (int c = 1; c <= number; ++c) {
							if (number % c == 0) {
								System.out.println(c + " ");
							}
						}
					}

				}

			}
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}

		System.out.println("Thanks!");
	}
}


