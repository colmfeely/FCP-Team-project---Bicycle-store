
public class BMX extends Bicycle {

	private boolean hasStuntPegs;
	
	public BMX(String colour,int frameSize,int wheelSize,String frameComposition) {

		super(colour, frameSize, wheelSize, frameComposition);
		
	}

	public boolean isHasStuntPegs() {
		return hasStuntPegs;
	}

	public void setHasStuntPegs(boolean hasStuntPegs) {
		this.hasStuntPegs = hasStuntPegs;
	}
	

}
