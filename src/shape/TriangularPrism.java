package shape;
/**
 * TriangularPrism class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07
 */
public class TriangularPrism extends Prism {

	/**
	 * Create a new TriangularPrism with given height and side
	 * @param height height
	 * @param side edge length
	 */
	public TriangularPrism(double height, double side) {
		super(height, side);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates the volume of TriangularPrism 
	 * @return volume 
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}

	/**
	 * Calculates the base area of TriangularPrism 
	 * @return base area 
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return (Math.sqrt(3)*this.getSide()*this.getSide())/4;
	}

}
