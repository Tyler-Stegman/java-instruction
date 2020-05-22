
public class Animal implements Countable {
	private int Count;

	public Animal() {
		super();
	}

	public Animal(int count) {
		super();
		Count = count;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}
	
	public void incrementCount() {
		Count = Count++;
	}

	@Override
	public String toString() {
		return "Animal [Count=" + Count + "]";
	}

	@Override
	public void resetCount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCountString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
