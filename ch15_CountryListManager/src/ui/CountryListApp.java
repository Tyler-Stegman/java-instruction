package ui;

import java.util.List;

import business.Country;
import db.CountryList;
import db.DAO;
import util.Console;

public class CountryListApp {
	private static DAO<Country> countryRepo = new CountryList();

		public static void main(String[] args) {
			// welcome & initialization
			System.out.println("Welcome to the Country List App!");
			String command = "";

			// - start loop
			while (!command.equalsIgnoreCase("exit")) {
				displayMenu();
				// get user input
				command = Console.getString("Command?: ", true);

				// business logic
				// display results
				switch (command) {
				case "get":
					getCountry();
					break;
				case "list":
					listCountries();
					break;
				case "add":
					addCountry();
					break;
				case "del":
					deleteCountry();
					break;
				case "exit":
					// exit the app
					break;
				default:
					// do nothing - exit app
					System.out.println("Invalid Entry. Try again");
					break;
				}
				// - end loop

			}
			// exit
			System.out.println("Thanks!");
		}

		private static void deleteCountry() {
			// prompt user for id and get the movie
			Country c = getIdAndReturnCountry();
			
			// delete the movie
			countryRepo.delete(c);
			
			
			// display confirmation message
			System.out.println("Country successfully deleted!");
			System.out.println();
			
		}

		private static void addCountry() {
			// prompt user for country data
			String country = Console.getString("Country: ", true);
			// add the movie
			Country c = new Country(0, country);
			countryRepo.add(c);
			
			// display confirmation message
			System.out.println("Country successfully added!");
			
		}

		private static void listCountries() {
			// get list of all movies
			List<Country> countries = countryRepo.list();
			
			// display to screen
			for(Country c: countries) {
				System.out.println(c);
			}
			
			
		}

		private static void getCountry() {
			// prompt user for id and get the movie
			Country c = getIdAndReturnCountry();
			
			// display to screen
			System.out.println(c);
			
		}
		
		private static Country getIdAndReturnCountry() {
			Country c = null;
			while (c == null) {
				int id = Console.getInt("Country ID: ", 0, (int)Double.POSITIVE_INFINITY);
				c = countryRepo.get(id);
				System.out.println();
			}
			
			return c;
		}

		private static void displayMenu() {
			StringBuilder menu = new StringBuilder("COMMAND MENU\n");
			menu.append("list   - List all countries\n");
			menu.append("get    - Get a country by id\n");
			menu.append("add    - Add a country\n");
			menu.append("del    - Delete a country\n");
			menu.append("exit   - Exit the Program\n");
			System.out.println(menu);
		}


	}


