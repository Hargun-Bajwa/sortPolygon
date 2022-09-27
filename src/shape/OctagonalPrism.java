package shape;
/**
 * OctagonalPrism class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07 
 */
public class OctagonalPrism extends Prism {

	
	/**
	 * Create a new OctagonalPrism with given height and side
	 * @param height Height
	 * @param side edge length
	 */
	public OctagonalPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Calculates the volume of OctagonalPrism 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}

	/**
	 * Calculates the base area of OctagonalPrism 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return 2*(1+Math.sqrt(2))*this.getSide()*this.getSide();
	}

}
