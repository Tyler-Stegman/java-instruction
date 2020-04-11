package ui;

import java.util.*;
import business.Tank;
import util.Console;

public class TankBattleApp {

	private static List<Tank> tanks = new ArrayList<>();

	public static void main(String[] args) {

		Tank t1 = new Tank(1, "Axis", "Heavy", "Panzerkampfwagen VI (Tiger I)", 800, 1000);
		Tank t2 = new Tank(2, "Axis", "Medium", "Panzerkampfwagen V (Panther I)", 800, 800);
		Tank t3 = new Tank(3, "Axis", "Light", "Panzerkampfwagen IV (Panzer IV)", 500, 500);
		Tank t4 = new Tank(4, "Allies", "Heavy", "M26 Pershing", 750, 1000);
		Tank t5 = new Tank(5, "Allies", "Medium", "M4 Sherman (Firefly)", 750, 600);
		Tank t6 = new Tank(6, "Allies", "Light", "M3 Lee", 500, 500);
		tanks.add(t1);
		tanks.add(t2);
		tanks.add(t3);
		tanks.add(t4);
		tanks.add(t5);
		tanks.add(t6);

		System.out.println("Tank Battle!\n");
		String userName = Console.getString("Enter new username: ", true);
		System.out.println("Welcome, " + userName + ", to the Tank Battle App!");
		String command = "";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command = Console.getString("Command: ", true);
			switch (command) {
			case "tanks":
				listTanks();
				break;
			case "upgrade":
				upgradeTank();
				break;
			case "select":
				selectTank();
			case "exit":
				break;
			default:
				System.out.println("Invalid Entry. Try again");
				break;
			}
		}
		System.out.println();
		System.out.println("Thanks for playing!");

	}

	// TODO select Tank and play game?
	private static void selectTank() {
		// TODO Auto-generated method stub

	}

	private static void upgradeTank() {
		// TODO Auto-generated method stub

	}

	private static void listTanks() {
		System.out.println();
		System.out.println("Available Tanks");
		System.out.println("---------------");
		for (Tank t : tanks) {
			System.out.println(t);
		}
		if (tanks.size() < 1) {
			System.out.println("There are currently no pets available");
		}

	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n" + "===============\n");
		menu.append("tanks     -     show available tanks\n");
		menu.append("upgrate   -     show available upgrades - THIS FEATURE NOT YET AVAILABLE\n");
		menu.append("exit      -     exit program\n");
		System.out.println(menu);
	}
}
