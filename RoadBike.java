

public class RoadBike extends Bicycle  {

	int numberOfGears;
	
	public RoadBike(int numberOfGears,String model,String colour,int frameSize,int wheelSize,String frameComposition,Database database)  {

		
		super(model,colour, frameSize, wheelSize, frameComposition, database);
		
		this.numberOfGears = numberOfGears;
	}

	public int getNumberOfGears() {
		return numberOfGears;
	}

	public void setNumberOfGears(int numberOfGears) {
		this.numberOfGears = numberOfGears;
	}
	
	public void display(){
		
	}

}
