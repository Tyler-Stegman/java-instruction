
public class Car {
	//instance variables
	private String make;
	private String model;
	private int year;
	private double mpg;
	
	// fully loaded constructor
	
	public Car(String make, String model, int year, double mpg) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.mpg = mpg;
	}
	
	// empty constructor
	public Car() {
		super();
	}


	//getters/setters
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMpg() {
		return mpg;
	}
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	
}
