/**
 @author Colm Feely
 * BicycleTeamProject
 * RoadBike subclass of bicycle
 */

public class RoadBike extends Bicycle  {

	int numberOfGears;
	
	public RoadBike(int numberOfGears)  {

		
		super(colour, frameSize, wheelSize, frameComposition);
		
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
