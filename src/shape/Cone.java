package shape;
/**
 * Cone class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07
 */
public class Cone extends Shape {

	private double radius;
	
	/**
	 * Create a new Cone with given height and radius
	 * @param height Height 
	 * @param radius radius
	 */
	public Cone(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	/**
	 * Calculates the volume of Cone 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		
		return (calcBaseArea()*this.getHeight())/3;
	}
	
	/**
	 * Calculates the base area of Cone 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		
		return Math.PI*this.getRadius()*this.getRadius();
	}


	/**
	 * gets the radius of this cone
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * changes the radius of cone
	 * @param radius Radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
