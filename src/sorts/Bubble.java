package sorts;
import shape.Shape;
import java.util.*;
/**
 * Bubble Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */

public class Bubble{

	/**
	 * Sort the list using bubble sort from largest to smallest.
	 * This method is used for compare type : height.
	 * @param shape shape list
	 */
	public static void sort(Shape[] shape) 
	{ 
		
	
	int arrayLength = shape.length; 
	//go through each element, if next element is greater then do a swap for descending order
	for(int i= 0; i<arrayLength-1;i++) {  
		
		      for (int j = 0; j < arrayLength - i - 1; j++) 
		      {
		        if (shape[j+1].compareTo(shape[j])== 1)
		        	                         
		        	{
		        	Shape temp = shape[j];
		        	shape[j] = shape[j+1];
		        	shape[j+1] = temp;
		        
		        	}
		        }
		      }
										
	        
	      
	}
	
	/**
	 * Sort the list using bubble sort from largest to smallest.
	 * This method is used for compare type : base area and volume.
	 * @param shape shape list
	 * @param c comparator to use in the sorting
	 */
	public static void sort(Shape[] shape,Comparator<Shape> c) 
	{
		int arrayLength = shape.length; 
		//go through each element, if next element is greater then do a swap for descending order
		for(int i= 0; i<arrayLength-1;i++) {  
			
			      for (int j = 0; j < arrayLength - i - 1; j++) 
			      {
			        if (c.compare(shape[j+1],shape[j])== 1)
			        	                         
			        	{
			        	Shape temp = shape[j];
			        	shape[j] = shape[j+1];
			        	shape[j+1] = temp;
			        
			        	}
			        }
			      }
		
		
	}
}