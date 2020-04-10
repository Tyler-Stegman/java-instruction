package ui;

import java.util.*;
import business.Pet;
import business.Product;
import util.Console;

public class PetStoreApp {
	
	private static List<String> pets = new ArrayList<>();

	public static void main(String[] args) {
		// Welcome and initialization
		System.out.println("Welcome to the Pet Store App!");
		System.out
				.println("This application will manage a list of pets.  You can add pets to the inventory, and remove");
		System.out.println("them when they get adopted.");
		System.out.println();
		String command = "";
		// - start loop -
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			// User input
			command = Console.getString("Command: ", true);
			// Business logic
			// Display results
			switch (command) {
			case "list":
				listPets();
				break;
			case "add":
				addPet();
				break;
			case "adopt":
				adoptPet();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid Entry. Try again");
				break;
			}
		}
		// exit
		System.out.println("Thank you for using the Pet Store App!");
	}

	private static void listPets() {
		

	}

	private static void addPet() {
		// prompt user for pet data
		  String type = Console.getString("Type: ", true); 
		  String species = Console.getString("Species: ", true); 
		  String name = Console.getString("Name: ", true);
		  Integer age = Console.getInt("Age: ", 0, 100);
		  //String age = Console.getInt("Age: ", 0, 100); 	
		  pets.add(type);
		  pets.add(species);
		  pets.add(name);
		  pets.add(age);

		// display confirmation message
		System.out.println(name + " was added.");
	}

	private static void adoptPet() {
		// remove pet from list
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU:\n" + "===============\n");
		menu.append("list   - List all pets\n");
		menu.append("add    - add pet to inventory\n");
		menu.append("adopt  - remove adopted pet from inventory\n");
		menu.append("exit   - Exit the application\n");
		System.out.println(menu);
	}
}
