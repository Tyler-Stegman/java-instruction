
public class Die {
	// instance variable(s)
	private int value;
	
	// constructor(s)
	public Die() {
		value = 0;
	}
	// public void roll is a method - not a constructor
	public void roll() {
		value = (int) (Math.random() * 6) + 1;
	}
	// getters / setters
	public int getValue() {
		return value;
	}
	
}
