package ui;

import java.util.Scanner;

public class PrimeNumberCheckerArrayApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Prime Number Checker App!");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer between 1 and 5000: ");
			int input = Integer.parseInt(sc.nextLine());
			if (input < 1 || input > 5000) {
				System.out.println("Error! Integer must be between 1 and 5000");
				continue;
			}
			Integer iArray[] = new Integer[input];
			for (int i = 0; i < iArray.length; i++) {
				
			}
		}

	}

}
