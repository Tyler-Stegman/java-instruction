package ui;

import java.util.List;

import business.Movie;
import db.DAO;
import db.MovieList;
import util.Console;

public class BmdbConsoleApp {
	private static DAO<Movie> movieRepo = new MovieList();

	public static void main(String[] args) {
		// welcome & initialization
		System.out.println("Welcome to the BMDB Console App!");
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
				getMovie();
				break;
			case "list":
				listMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
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

	private static void deleteMovie() {
		// prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		
		// delete the movie
		movieRepo.delete(m);
		
		
		// display confirmation message
		System.out.println("Movie successfully deleted!");
		System.out.println();
		
	}

	private static void addMovie() {
		// prompt user for movie data
		//int id = Console.getInt("Movie ID: ", 0, (int)Double.POSITIVE_INFINITY);
		String title = Console.getString("Movie Title: ", true);
		int year = Console.getInt("Release year: ", 0, (int)Double.POSITIVE_INFINITY);
		String rating = Console.getString("Movie Rating: ", true);
		String director = Console.getString("Movie Director: ", true);
		// add the movie
		Movie m = new Movie(0, title, year, rating, director);
		movieRepo.add(m);
		
		// display confirmation message
		System.out.println("Movie successfully added!");
		
	}

	private static void listMovies() {
		// get list of all movies
		List<Movie> movies = movieRepo.list();
		
		// display to screen
		for(Movie m: movies) {
			System.out.println(m);
		}
		
		
	}

	private static void getMovie() {
		// prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		
		// display to screen
		System.out.println(m);
		
	}
	
	private static Movie getIdAndReturnMovie() {
		Movie m = null;
		while (m == null) {
			int id = Console.getInt("Movie ID: ", 0, (int)Double.POSITIVE_INFINITY);
			m = movieRepo.get(id);
			System.out.println();
		}
		
		return m;
	}

	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all movies\n");
		menu.append("get    - Get a movie by id\n");
		menu.append("add    - Add a movie\n");
		menu.append("del    - Delete a movie\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}

}
