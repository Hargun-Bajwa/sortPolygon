package comparator;
import shape.Shape;
import java.util.Comparator;
/**
 * AreaCompare Class
 *@author Agambeer Brar, argun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */

public class AreaCompare implements Comparator<Shape>{

	/** 
	* Class constructor.
	*/
	public AreaCompare() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Compare the base area of two shapes and return the result as a number
	 * @param o1 comparison target1
	 * @param o2 comparison target2
	 * @return 1 or -1 or 0 
	 */
	@Override
	public int compare(Shape o1, Shape o2) {
		// TODO Auto-generated method stub
		double o1Area = o1.calcBaseArea();
		double o2Area = o2.calcBaseArea();
		if (o1Area > o2Area)
			return 1;
		else if(o1Area < o2Area)
			return -1;
		else
			return 0;
	}

}
