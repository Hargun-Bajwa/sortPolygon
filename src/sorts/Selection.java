package sorts;
import java.util.Comparator;

import shape.Shape;

/**
 * Selection Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */
public class Selection {

	/**
	 * Sort the list using selection sort from largest to smallest.
	 * This method is used for compare type : height.
	 * @param shape shape list
	 */
	public static void sort(Shape[] shape) {
		
		int arrayLength = shape.length;
		// go through each element with current element as max if there is any element greater then swap those
		
		for(int i = 0; i < arrayLength-1; i++){
	        int max = i;
	        for(int j = i+1; j < arrayLength; j++){
	            if(shape[j].compareTo(shape[max])==1){
	                max = j;
	            }
	        }
	        if(max != i){ 
	            swap(shape,max,i);
	        }}
			            
	}
	
	
	/**
	 * Sort the list using selection sort from largest to smallest.
	 * This method is used for compare type : base area and volume.
	 * @param shape shape list
	 * @param c comparator to use in the sorting
	 */
	public static void sort(Shape[] shape,Comparator<Shape> c) 
	{
		int arrayLength = shape.length;
		
		// go through each element with current element as max if there is any element greater then swap those
		for(int i = 0; i < arrayLength-1; i++){
	        int max = i;
	        for(int j = i+1; j < arrayLength; j++){
	            if(c.compare(shape[j],shape[max])==1){
	                max = j;
	            }
	        }
	        if(max != i){ 
	            swap(shape,max,i);
	        }
			
	}}
	
	/**
	 * Swap the order in the list
	 * @param list shape list
	 * @param i first element's index
	 * @param j second element's index
	 */
	public static void swap(Shape[] list, int i, int j)
	{
		Shape tmp = list[i];
		list[i] = list[j];
		list[j] = tmp;
	
}
}
