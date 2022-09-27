package comparator;
import shape.Shape;
import java.util.Comparator;
/**
 * VolumeCompare Class
 *@author Agambeer Brar, argun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */
public class VolumeCompare implements Comparator<Shape>{
	
	
	/** 
	* Class constructor.
	*/
	public VolumeCompare() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Compare the volume of two shapes and return the result as a number
	 * @param o1 comparison target1
	 * @param o2 comparison target2s
	 * @return 1 or -1 or 0 
	 */
	@Override
	public int compare(Shape o1, Shape o2) {
		
		double o1Volume = o1.calcVolume();
		double o2Volume = o2.calcVolume();
		if (o1Volume > o2Volume)
			return 1;
		else if(o1Volume < o2Volume)
			return -1;
		else
			return 0;
	}

}
