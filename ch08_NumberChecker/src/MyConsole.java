
public class MyConsole extends Console_NotStatic {
	private int integer;
	
	public MyConsole() {
		super();
	}
	public MyConsole(int integer) {
		super();
		this.integer = integer;
	}

	public int getInteger() {
		return integer;
	}
	public void setInteger(int integer) {
		this.integer = integer;
	}
	@Override
	public String toString() {
		return "MyConsole []";
	}
	
}
