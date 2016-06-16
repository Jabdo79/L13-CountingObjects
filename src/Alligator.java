
public class Alligator implements Countable {
	
	private int count=0;

	public void incrementCount() {
		count++;
	}

	public void resetCount() {
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public String getCountString() {
		return count + " alligator";
	}
}
