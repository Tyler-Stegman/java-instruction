package db;

import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieList implements DAO<Movie> {
	private List<Movie> movies = null;
	
	public MovieList() {
		// initialize the list of movies
		movies = new ArrayList<Movie>();
		Movie m1 = new Movie(1, "Indiana Jones and the Last Crusade", 1989, "PG-13", "Steven Spielberg");
		Movie m2 = new Movie(2, "The Pianist", 2002, "R", "Roman Polanski");
		Movie m3 = new Movie(3, "Jurassic Park", 1993, "PG-13", "Steven Spielberg");
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
	}

	@Override
	public Movie get(int id) {
		// get a movie for the given movie id
		Movie m = null;
		for(Movie movie : movies) {
			if (movie.getId() == id) {
				m = movie;
			}
		}
		return m;
	}

	@Override
	public List<Movie> list() {
		// return the full list of movies
		return movies;
	}

	@Override
	public boolean add(Movie m) {
		// add a movie
		// if movie id is zero, generate an id
		if(m.getId()==0)
			m.setId(generateId());
		m.setId(generateId());
		return movies.add(m);
	}
	
	private int generateId() {
		int id =0;
		for(Movie m: movies) {
			id = Math.max(id, m.getId());
		}
		return id+1;
	}

	@Override
	public boolean update(Movie t) {
		// TODO Yet to be implemented
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		// delete movie from the list
		return movies.remove(m);
	}

}
