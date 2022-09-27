package shape;
/**
 * Pyramid class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07
 */
public class Pyramid extends Shape {

	private double side;
	
	/**
	 * Create a new Pyramid with given height and side
	 * @param height Height 
	 * @param side edge length
	 */
	public Pyramid(double height, double side) {
		super(height);
		this.side = side;
	}

	/**
	 * Calculates the volume of Pyramid 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return (this.calcBaseArea()*this.getHeight())/3;
	}

	/**
	 * Calculates the base area of Pyramid 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return this.getSide()*this.getSide();
	}

	/**
	 * gets the side of this Pyramid
	 * @return side
	 */
	public double getSide() {
		return side;
	}
	
	/**
	 * changes the side of Pyramid
	 * @param side edge length
	 */
	public void setSide(double side) {
		this.side = side;
	}

}
