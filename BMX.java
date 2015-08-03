
public class BMX extends Bicycle {

	private boolean hasStuntPegs;
	
	public BMX() {

		super(colour, frameSize, wheelSize, frameComposition);
		
	}

	public boolean isHasStuntPegs() {
		return hasStuntPegs;
	}

	public void setHasStuntPegs(boolean hasStuntPegs) {
		this.hasStuntPegs = hasStuntPegs;
	}
	

}
