package business;

public class Aircraft {

	private String type;
	private String name;
	private int nrOfEngines;
	
	public Aircraft() {
		super();
	}

	public Aircraft(String type, String name, int nrOfEngines) {
		super();
		this.type = type;
		this.name = name;
		this.nrOfEngines = nrOfEngines;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNrOfEngines() {
		return nrOfEngines;
	}

	public void setNrOfEngines(int nrOfEngines) {
		this.nrOfEngines = nrOfEngines;
	}

	@Override
	public String toString() {
		return "Aircraft [type=" + type + ", name=" + name + ", nrOfEngines=" + nrOfEngines + "]";
	}
	
	
}
