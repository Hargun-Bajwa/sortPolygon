package sorts;
import shape.Shape;
import java.util.*;
/**
 * Quick Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */


public class Quick {
	/**
	 * This method is used to quick sort array 
	 * This method is only for height
	 * @param shape polygon
	 */
	
	public static void sort(Shape[] shape)  {
		int arrayLength=shape.length;
		// start the function with whole array
		sorter(shape,0,arrayLength-1);
}
	/**
	 * This method is used to find the pivot then sort the array recursively.
	* @param shape Shape polygon
	 * @param start first element index
	 * @param end last element index
	 */
	public static void sorter(Shape[] shape, int start, int end)
	{
		
		if (start < end) {

		      
		      int pivot = checkAndSwap(shape, start, end);
		      
		      
		      sorter(shape, start, pivot - 1);

		      
		      sorter(shape, pivot + 1, end);
	    }
	}	
	
	/**
	 * This method is used check the array elements and sort them in descending order by swaping them.
	 * @param shape Shape polygon
	 * @param start first element index
	 * @param end last element index
	 * @return i+1    the pivot to be in next recursion of sorter function in quick sort.
	 */
	public static int checkAndSwap (Shape[] shape, int start, int end)
	{
	    
        Shape pivot = shape[end];
	    
	    
	    int i = (start - 1);

	    
	    for (int j = start; j < end; j++) {
	      if (shape[j].compareTo(pivot)==1) {

	        
	        i++;

	        //swap if the element is bigger than other
	        swap(shape,i,j);
	      }

	    }

	    
	    swap(shape,i+1,end);
	    return (i + 1);
	}
	
	/**
	 * This method is used to quick sort array 
	 * This method is only for base area and volume 
	 * @param shape polygon
	 * @param c comparator to use in the sorting
	 */
	public static void sort(Shape[] shape, Comparator<Shape> c)  {
		int arrayLength=shape.length;
		sorter(shape,0,arrayLength-1,c);
}
	/**
	 * This method is used to find the pivot then sort the array recursively.
	* @param shape Shape polygon
	 * @param start first element index
	 * @param end last element index
	 * @param c comparator to use in the sorting
	 */
	public static void sorter(Shape[] shape, int start, int end, Comparator<Shape> c)
	{
		if (start < end) {

		      
		      int pivot = checkAndSwap(shape, start, end,c);
		      
		      
		      sorter(shape, start, pivot - 1,c);

		      
		      sorter(shape, pivot + 1, end,c);
	    }
	}	
	/**
	 * This method is used check the array elements and sort them in descending order by swaping them.
	 * @param shape Shape polygon
	 * @param start first element index
	 * @param end last element index
	 * @param c comparator to use in the sorting
	 * @return i+1    the pivot to be in next recursion of sorter function in quick sort.
	 */
	
	public static int checkAndSwap (Shape[] shape, int start, int end, Comparator<Shape> c)
	{
	    Shape pivot = shape[end];
	    
	    
	    int i = (start - 1);

	    
	    for (int j = start; j < end; j++) {
	      if (c.compare(shape[j],pivot)==1) {

	        
	        i++;

	        
	        swap(shape,i,j);
	      }

	    }

	    
	    swap(shape,i+1,end);

	    
	    return (i + 1);
	}
	
	
	
	public static void swap(Shape[] shape,int i,int j)
	{
	    Shape temp = shape[i];
	    shape[i]=shape[j];
	    shape[j]=temp;
	}
	
	

	
	}
	

