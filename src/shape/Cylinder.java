package shape;
/**
 * Cylinder class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07 
 */
public class Cylinder extends Shape {

	private double radius;
	
	/**
	 * Create a new Cylinder with given height and radius
	 * @param height Height
	 * @param radius radius
	 */
	public Cylinder(double height, double radius) {
		super(height);
		this.radius = radius;
	}
	/**
	 * Calculates the volume of Cylinder 
	 * @return volume
	 */
	@Override
	public double calcVolume() {
		// TODO Auto-generated method stub
		return this.calcBaseArea()*this.getHeight();
	}
	
	
	/**
	 * Calculates the base area of Cylinder 
	 * @return base area
	 */
	@Override
	public double calcBaseArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.getRadius()*this.getRadius();
	}
	
	
	/**
	 * gets the radius of this Cylinder
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * changes the radius of Cylinder
	 * @param radius  Radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

}
