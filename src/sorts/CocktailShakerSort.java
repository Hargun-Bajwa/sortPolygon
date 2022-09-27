package sorts;
import java.util.Comparator;
import shape.Shape;
/**
 * CocktailShakerSort Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */
public class CocktailShakerSort{

	
	/**
	 * Swap the elements in the list
	 * @param list shape list
	 * @param i index of first element 
	 * @param j index of second element
	 */
	public static void swap(Shape[] list, int i, int j)
	{
		Shape tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;

	}
	
	/**
	 * Sort the list using CocktailShaker sort from largest to smallest.
	 * This method is used for compare type : height.
	 * @param shapeL shape list
	 */
	public static void sort(Shape[] shapeL)
	{
		int left = 0;
	    int right = shapeL.length -1;
	    int shift = 0;
	    while( left < right){
	        for(int i = left; i < right; i++) {
	            if(shapeL[i].compareTo(shapeL[i+1]) == -1)
	            {  
	                swap(shapeL, i, i+1);
	                shift = i;
	            }
	        }
	        right = shift;
	        for(int i = right; i > left; i--){
	        	if(shapeL[i].compareTo(shapeL[i-1]) == 1)
	            {
	                swap(shapeL, i, i - 1);
	                shift = i;
	            }           
	        }
	        left = shift;
	    }
	}
	
	/**
	 * Sort the list using CocktailShaker sort from largest to smallest.
	 * This method is used for compare type : base area and volume.
	 * @param shapeL shape list
	 * @param c comparator to use in the sorting
	 */
	public static void sort(Shape[] shapeL, Comparator<Shape> c)
	{
		int left = 0;
	    int right = shapeL.length -1;
	    int shift = 0;

	    while( left < right){
	        for(int i = left; i < right; i++) {
	            if(c.compare(shapeL[i], shapeL[i+1]) == -1)
	            {  
	                swap(shapeL, i, i+1);
	                shift = i;
	            }
	        }
	        right = shift;
	        for(int i = right; i > left; i--){
	        	if(c.compare(shapeL[i], shapeL[i-1]) == 1)
	            {
	                swap(shapeL, i, i - 1);
	                shift = i;
	            }           
	        }
	        left = shift;
	    }   
	}

}