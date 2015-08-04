
public class Cruiser extends Bicycle {

	private boolean hasTassles;
	
	public Cruiser(String colour,int frameSize,int wheelSize,String frameComposition,Database database) {
		
		super(colour, frameSize, wheelSize, frameComposition,database);

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
