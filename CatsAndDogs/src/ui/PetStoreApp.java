package ui;

import java.util.*;
import business.Pet;
import util.Console;

public class PetStoreApp {

	private static List<Pet> pets = new ArrayList<>();

	public static void main(String[] args) {
		
		Pet p1 = new Pet(1, "Cat", "Maine Coon", "Bonnie", 6);
		Pet p2 = new Pet(2, "Cat", "Maine Coon", "Clyde", 5);
		Pet p3 = new Pet(3, "Dog", "Collie", "Rusty", 8);
		pets.add(p1);
		pets.add(p2);
		pets.add(p3);
		// Welcome and initialization
		System.out.println("Welcome to the Pet Store App!");
		System.out.println("This application will manage a list of pets.  You can add pets to the inventory, and remove");
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
		// - end loop -
		}
		// exit
		System.out.println();
		System.out.println("Thank you for using the Pet Store App!");
	}

	private static void listPets() {
		System.out.println();
		System.out.println("Pet Inventory");
		System.out.println("---------------");
		for (Pet p : pets) {
			System.out.println(p);
		}
		if (pets.size()<1) {
			System.out.println("There are currently no pets available");
		}
	}

	private static void addPet() {
		System.out.println();
		System.out.println("Add a Pet!");
		System.out.println("---------------");
		// prompt user for pet data
		String type = Console.getString("Type: ", true);
		String species = Console.getString("Species: ", true);
		String name = Console.getString("Name: ", true);
		Integer age = Console.getInt("Age: ", 0, (int) Double.POSITIVE_INFINITY);
		// create an instance of Pet - using the data above
		Pet p = new Pet(pets.size()+1, type, species, name, age);

		// add that instance to your list of pets
		pets.add(p);
		// display confirmation message
		System.out.println(name + " was added!");
	}

	private static void adoptPet() {
		System.out.println();
		System.out.println("Adopt a Pet!");
		System.out.println("---------------");
		int petId = Console.getInt("Pet ID: ", 0, pets.size()+1);
		Pet adoptedPet = pets.remove(petId -1);
		System.out.println(adoptedPet+" was adopted!.");
		System.out.println();
		System.out.println();
		if(pets.size()<1) {
			System.out.println("There are currently no more pets to adopt.");
		}
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
