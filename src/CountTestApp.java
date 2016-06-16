
public class CountTestApp {

	public static void main(String[] args) {
		
		System.out.println("Counting Alligators...\n");
		Alligator alli = new Alligator();
		//Counts 3 alligators
		CountUtil.count(alli, 3);
		
		System.out.println("Counting Sheep...\n");
		Sheep baa = new Sheep();
		baa.setName("Blackie");
		//count 2 blackie
		CountUtil.count(baa, 2);
		//clone blackie, change name to dolly, count 3 times
		Sheep clone = baa.clone();
		clone.setName("Dolly");
		CountUtil.count(clone, 3);
		//count the first sheep again one time
		CountUtil.count(baa, 1);
	}

}
