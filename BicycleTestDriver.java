
public class BicycleTestDriver {

	public BicycleTestDriver() {
		
		MountainBike bike1 = new MountainBike(5);
		bike1.setColour("red");
		System.out.println("colour of mountain bike is "+bike1.getColour());
	}

	public static void main(String[] args) {
		
		new BicycleTestDriver();

	}

}
