
public class Hybrid extends Bicycle {

	private int noOfGears;
	private boolean hasBasket;

	public Hybrid(int noOfGears) {

		super(colour, frameSize, wheelSize, frameComposition);
		this.noOfGears = noOfGears;
	}

	public boolean isHasBasket() {
		return hasBasket;
	}

	public void setHasBasket(boolean hasBasket) {
		this.hasBasket = hasBasket;
	}
	

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public void Display() {

	}
}
