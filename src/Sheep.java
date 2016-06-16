
public class Sheep implements Countable, Cloneable {

	private int count = 0;
	private String name = "";
	
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
		return count + " " + this.getName();
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	public Sheep clone() {
		Sheep clone = new Sheep();
		clone.setName(this.getName());
		return clone;
	}

}
