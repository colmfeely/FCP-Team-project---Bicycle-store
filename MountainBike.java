
public class MountainBike extends Bicycle {

	private int noOfGears;
	private boolean hasSuspension = true;
	
	public MountainBike(int noOfGears) {

		super(colour, frameSize, wheelSize, frameComposition);
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
