package shape;
/**
 * Prism class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07 
 */
public abstract class Prism extends Shape {
	
	private double side;
	
	/**
	 * Create a new Prism with given height and side
	 * @param height Height
	 * @param side edge Length
	 */
	public Prism(double height, double side) {
		super(height);
		this.side = side;
	}

	/**
	 * gets the side of this Prism
	 * @return side
	 */
	public double getSide() {
		return side;
	}

	/**
	 * changes the side of Prism
	 * @param side 
	 */
	public void setSide(double side) {
		this.side = side;
	}
}
