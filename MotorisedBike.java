
public class MotorisedBike extends Bicycle {
	
	private boolean requiresLicence;

	public MotorisedBike(String model,String colour,int frameSize,int wheelSize,String frameComposition,Database database) {

		super(model,colour, frameSize, wheelSize, frameComposition,database);
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
