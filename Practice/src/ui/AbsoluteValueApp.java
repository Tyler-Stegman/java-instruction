package ui;

import java.util.Scanner;

import util.Console;

public class AbsoluteValueApp {

	public static void main(String[] args) {
		String choice = "y";
		Scanner sc = new Scanner(System.in);

		while (choice.equalsIgnoreCase("y")) {
			double num = Console.getDouble("Please enter a number: ");
			double absNum;
			if (num < 0) {
				absNum = num * -1;
				System.out.println("The absolute value of"+num+" is:"+absNum);
				
			}
			else {
				System.out.println("The absolute value of "+num+" is:"+num);
					break;
			}
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}
		System.out.println("Thanks!");
	}
}
