package shape;
/**
 * Shape class
 * @author Agambeer Brar, Hargun Singh Bajwa, Wen-Chi Wu, Yoojin Park
 * @version 2021-10-07 
 */
public abstract class Shape implements Comparable<Shape>
{
	
	/**
	 * Create a new Shape with given height
	 * @param height Height
	 */
	public Shape(double height) {
		this.height = height;
	}
	
	private double height; // Shape's height
	public abstract double calcVolume(); // Shapes Volume
	public abstract double calcBaseArea(); // Shape's Base Area
	
	/**
	 * gets the height of this Shape
	 * @return height height
	 */
	public double getHeight() {
		return height;
	}
	
	/**
	 * changes the height of Shape
	 * @param height Height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Compare the height of two shapes and return the result as a number
	 * @param that comparison target
	 * @return 1 or -1 or 0 
	 */
	@Override
	public int compareTo(Shape that)
	{
		if( this.getHeight() > that.getHeight() )
		{
			return 1;
		}
		else if( this.getHeight() < that.getHeight() )
		{
			return -1;
		}
		else // this.ID == that.ID
		{
			return 0;
		}
	}
}
	