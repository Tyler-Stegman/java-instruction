import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the temperature converter!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	
            System.out.print("Enter degrees in Fahrenheit: ");
            double degrees = sc.nextDouble();
            
            double c = (degrees - 32)* 5/9;
            double c2 = (double)(Math.round(c*100)) / 100;
            System.out.println("Degrees in Celsius: "+c2);
            System.out.println();
            System.out.println("Continue? (y/n)");
            choice = sc.next();
            System.out.println();
            
            
            
        }

	}

}
