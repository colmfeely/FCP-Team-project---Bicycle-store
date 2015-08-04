/**
 * @author Colm Feely
 * BicycleTeamProject
 * Bicycle Super Class
 *
 */


public class Bicycle {

	private String colour;
	private int frameSize;
	private int wheelSize;
	private String frameComposition;
	boolean inStock = false;
	
	public Bicycle(String colour,int frameSize,int wheelSize,String frameComposition) {
		
		this.colour = colour;
		this.frameSize = frameSize;
		this.wheelSize = wheelSize;
		this.frameComposition = frameComposition;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}

	public int getWheelSize() {
		return wheelSize;
	}

	public void setWheelSize(int wheelSize) {
		this.wheelSize = wheelSize;
	}

	public String getFrameComposition() {
		return frameComposition;
	}

	public void setFrameComposition(String frameComposition) {
		this.frameComposition = frameComposition;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

}
