package db;


import java.util.ArrayList;
import java.util.List;

import business.Country;

public class CountryList implements DAO<Country> {
	private List<Country> countries = null;
	
	public CountryList() {
		// initialize the list of countries
		countries = new ArrayList<Country>();
		Country c1 = new Country(1, "Canada");
		Country c2 = new Country(2, "United States");
		Country c3 = new Country(3, "Mexico");
		countries.add(c1);
		countries.add(c2);
		countries.add(c3);
	}

	@Override
	public Country get(int id) {
		// get a movie for the given movie id
		Country c = null;
		for (Country country : countries) {
			if (country.getId() == id) {
				c = country;
			}
		}
		return c;
	}

	@Override
	public List<Country> list() {
		// return the full list of movies
		return countries;
	}

	@Override
	public boolean add(Country c) {
		// add a movie
		// if movie id is zero, generate an id
		if (c.getId() == 0)
			c.setId(generateId());
		c.setId(generateId());
		return countries.add(c);
	}

	private int generateId() {
		int id = 0;
		for (Country c : countries) {
			id = Math.max(id, c.getId());
		}
		return id + 1;
	}

	@Override
	public boolean update(Country t) {
		// TODO Yet to be implemented
		return false;
	}

	@Override
	public boolean delete(Country c) {
		// delete movie from the list
		return countries.remove(c);
	}

}
