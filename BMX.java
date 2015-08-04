
public class BMX extends Bicycle {

	private boolean hasStuntPegs;
	
	public BMX(String colour,String model,int frameSize,int wheelSize,String frameComposition,Database database) {

		super(model,colour, frameSize, wheelSize, frameComposition,database);
		
	}

	public boolean isHasStuntPegs() {
		return hasStuntPegs;
	}

	public void setHasStuntPegs(boolean hasStuntPegs) {
		this.hasStuntPegs = hasStuntPegs;
	}
	

}
