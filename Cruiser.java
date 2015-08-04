
public class Cruiser extends Bicycle {

	private boolean hasTassles;
	
	public Cruiser(String colour,int frameSize,int wheelSize,String frameComposition) {
		
		super(colour, frameSize, wheelSize, frameComposition);

	}

	public boolean isHasTassles() {
		return hasTassles;
	}

	public void setHasTassles(boolean hasTassles) {
		this.hasTassles = hasTassles;
	}
	public void Display(){
		
	}

}
