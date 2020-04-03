package ui;

import java.text.NumberFormat;

import business.Product;
import util.Console;

public class ArraysPracticeApp {

	public static void main(String[] args) {
		System.out.println("Array Practice");
		System.out.println();
		String choice = "y";
		
		String[] names = new String[12]; 
		names[0] = "Tony";
		names[1] = "Bob";
		names[2] = "Jenny";
		names[3] = "Scooter";
		names[4] = "Tom";
		names[5] = "Randy";
		names[6] = "Jim";
		names[7] = "Trevor";
		names[8] = "Corey";
		names[9] = "Ricky";
		names[10] = "Julian";
		names[11] = "Sam";
		
		Double[] wages = new Double[12];
		wages[0] =  36.50;
		wages[1] = 27.75;
		wages[2] = 32.50;
		wages[3] = 14.50;
		wages[4] = 37.80;
		wages[5] = 21.55;
		wages[6] = 26.45;
		wages[7] = 2.00;
		wages[8] = 2.50;
		wages[9] = 10.25;
		wages[10] = 12.50;
		wages[11] = 0.01;
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		
		while(choice.equalsIgnoreCase("y")){
			int nameNumber = Console.getInt("Enter Employee Number: ");
			if (nameNumber < 1 || nameNumber > names.length) {
                Console.displayLine("Invalid Employee Number. Try again.");
                continue;                
            }
			int nameIndex = nameNumber -1;
            Console.displayLine("Employee: "+names[nameIndex]+"\n"+"Employee Wage: "+nf.format(wages[nameIndex]));
            System.out.println();
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}
		double total = 0;
		for (double wage : wages) {
			total += wage;
		}
		System.out.println("Total Wages: "+nf.format(total));
		System.out.println("Thanks!");
	}

}
