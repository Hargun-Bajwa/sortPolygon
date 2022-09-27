package shape;
/**
 * PentagonalPrism class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07
 */
public class PentagonalPrism extends Prism {

	/**
	 * Create a new PentagonalPrism with given height and side
	 * @param height Height
	 * @param side edge Length
	 */
	public PentagonalPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates the volume of PentagonalPrism 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}

	/**
	 * Calculates the base area of PentagonalPrism 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 5*this.getSide()*this.getSide()/(4*Math.sqrt(5-2*Math.sqrt(5)));
	}

}
