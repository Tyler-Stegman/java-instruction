
public abstract class Sheep extends Animal implements Cloneable {
	
	private String name;

	public Sheep() {
		super();
	}

	public Sheep(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Counting sheep...\n";
	}
	
	@Override
	public String getCountString() {
		return name;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
