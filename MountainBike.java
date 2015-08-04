
public class MountainBike extends Bicycle {

	private int noOfGears;
	private boolean hasSuspension = true;
	
	public MountainBike(int noOfGears,String model,String colour,int frameSize,int wheelSize,String frameComposition,Database database) {

		super(model,colour, frameSize, wheelSize, frameComposition,database);
		this.noOfGears = noOfGears;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public boolean isHasSuspension() {
		return hasSuspension;
	}

	public void setHasSuspension(boolean hasSuspension) {
		this.hasSuspension = hasSuspension;
	}
	
	public void display(){
		
	}

}
