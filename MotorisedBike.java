
public class MotorisedBike extends Bicycle {
	
	private boolean requiresLicence;

	public MotorisedBike(String colour,int frameSize,int wheelSize,String frameComposition) {

		super(colour, frameSize, wheelSize, frameComposition);
	}

	public boolean isRequiresLicence() {
		return requiresLicence;
	}

	public void setRequiresLicence(boolean requiresLicence) {
		this.requiresLicence = requiresLicence;
	}

	public void Display(){
		
	}
}
