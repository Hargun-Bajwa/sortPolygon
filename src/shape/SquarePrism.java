package shape;
/**
 * SquarePrism class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07
 */
public class SquarePrism extends Prism {

	/**
	 * Create a new SquarePrism with given height and side
	 * @param height Height
	 * @param side edge length
	 */
	public SquarePrism(double height, double side) {
		super(height, side);
	}
	
	

	/**
	 * Calculates the volume of SquarePrism 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}

	/**
	 * Calculates the base area of SquarePrism 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return this.getSide()*this.getSide();
	}

}
