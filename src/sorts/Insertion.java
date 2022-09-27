package sorts;
import java.util.Comparator;

import shape.Shape;
/**
 * Insertion Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */
	public class Insertion {
		
		/**
		 * Sort the list using insertion sort from largest to smallest.
		 * This method is used for compare type : height.
		 * @param shape shape
		 */
		public static void sort(Shape[] shape) 
		{ 
			
		
			int arrayLength = shape.length;
			
		      for(int i = 0; i < arrayLength; i++)
		      {
		         Shape element = shape[i];
		         int j = i - 1;
		         while(j >= 0 && element.compareTo(shape[j])== 1)
		         {
		            shape[j + 1] = shape[j];
		            j = j - 1;
		         }
		         shape[j + 1] = element;
		      }
		}
	

		/**
		 * Sort the list using insertion sort from largest to smallest.
		 * This method is used for compare type : base area and volume.
		 * @param shape shape list
		 * @param c comparator to use in the sorting
		 */
		public static void sort(Shape[] shape, Comparator<Shape> c) {
			
			int arrayLength = shape.length;
			
		      for(int i = 0; i < arrayLength; i++)
		      {
		         Shape element = shape[i];
		         int j = i - 1;
		         while(j >= 0 && c.compare(shape[j],element)== -1)
		         {
		            shape[j + 1] = shape[j];
		            j = j - 1;
		         }
		         shape[j + 1] = element;
		      }
		}
}