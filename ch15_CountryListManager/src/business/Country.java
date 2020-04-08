package business;

public class Country {
	
	private int id;
	private String country;
	
	public Country() {
		super();
	}

	public Country(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + "]";
	}
	
	

}
