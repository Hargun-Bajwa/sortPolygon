package sorts;

import java.util.Comparator;

import shape.Shape;
/**
 * Merge Class
 *@author Agambeer Brar, Hargun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */

public class Merge {
	
	

	/**
	 * Sort the list using Merge sort from largest to smallest element.
	 * This method is used for compare type : height.
	 * @param shape shape list
	 */
	public static void sort(Shape[] shape)  {
		int arrayLength=shape.length;
		// invoking a divideThenMerge which will divide the array into smaller arrays then will merge all smaller arrays
		divideThenMerge(shape,0,arrayLength-1);
}
	/**
	 * This method is used to divide the big array into smaller arrays till there is array of one element only or empty array.
	 * @param shape shape list
	 * @param start  first index 
	 * @param end last index 
	 */
	public static void divideThenMerge(Shape[] shape, int start, int end)
	{
		// dividing it till we get array of only one or zero element
		if (start < end) {

			  int mid=(int)(start+end)/2;
		     
		      divideThenMerge(shape, start, mid);
		      divideThenMerge(shape, mid+1, end);
		      // then merge smaller arrays for big sorted arrays
		      merge(shape,start,mid,end);
	    }
	}	
	/**
	 * This method is used to merge the smaller arrays into bigger arrays till there is array of all element as in original array while comparing  and sorting them in descending order.
	 * This method is only for height
	 * @param shape shape list
	 * @param start first index
	 * @param mid divided index
	 * @param end last index
	 */
	public static void merge(Shape[] shape,int start,int mid,int end) {
		// create new sub-arrays with half elements 
		Shape[] firstHalf= new Shape[mid-start+1];
		Shape[] secondHalf= new Shape[end-mid];
		// fill the arrays with elements for larger arrays
		for(int i=0;i<firstHalf.length;i++) {
			firstHalf[i]=shape[start+i];
		}
		for(int j=0;j<secondHalf.length;j++) {
			secondHalf[j]=shape[(mid+1)+j];
		}
		
		// i and j will work as counter which will move through till there are no elements in smaller arrays
		int i=0;
		int j=0;
		//making a loop to fill up a merged sorted array with elements of smaller arrays
		int mergedArrayIndex = start;
		while ( mergedArrayIndex <= end ) {
			// using counters to go through each element in sub arrays
		if (i < firstHalf.length && j < secondHalf.length) {
			//using compareTo function to compare heights 
			if (firstHalf[i].compareTo(secondHalf[j])>=0) {
				// if true that means element in first array is greater so it will be earlier element of sorted array as in descending order 
				shape[mergedArrayIndex] = firstHalf[i];
				i++;
			} 
			else {
				// if false that means element in second array is greater so it will be earlier element of sorted array as in descending order 
				shape[mergedArrayIndex] = secondHalf[j];
				j++;
			}
		} 
		else { 
			// if there are remaining elements in any small arrays
			if (i < firstHalf.length) {
		shape[mergedArrayIndex] = firstHalf[i];
		i++;
		}   if (j < secondHalf.length) {
		shape[mergedArrayIndex] = secondHalf[j];
		j++;
		}
		}
		 mergedArrayIndex++;
	}
	
	}
	/**
	 * Sort the list using Merge sort from largest to smallest element.
	 * This method is used for compare type : base area and volume.
	 * @param shape shape
	 * @param c comparator to use in the sorting
	 */
	public static void sort(Shape[] shape, Comparator<Shape> c)  {
		int arrayLength=shape.length;
		// invoking a divideThenMerge which will divide the array into smaller arrays then will merge all smaller arrays
		divideThenMerge(shape,0,arrayLength-1,c);
}
	/**
	 * This method is used to divide the big array into smaller arrays till there is array of one element only or empty array.
	 * @param shape shape list
	 * @param start first index 
	 * @param end last index
	 * @param c comparator to use in the sorting
	 */
	public static void divideThenMerge(Shape[] shape, int start, int end,Comparator<Shape> c)
	{   // dividing it till we get array of only one or zero element
		if (start < end) {

			  int mid=(int)(start+end)/2;
		     
		      divideThenMerge(shape, start, mid,c);
		      divideThenMerge(shape, mid+1, end,c);
		      // then merge smaller arrays into big sortedarrays
		      merge(shape,start,mid,end,c);
	    }
	}	
	/**
	 * This method is used to merge the smaller arrays into bigger arrays till there is array of all element as in original array while comparing  and sorting them in descending order.
	 * This method is only for height
	 * @param shape shape list
	 * @param start first index 
	 * @param mid divided index 
	 * @param end last index
	 * @param c comparator to use in the sorting
	 */
	 
	public static void merge(Shape[] shape,int start,int mid,int end, Comparator<Shape> c) {
		// create new sub-arrays with half elements 
			Shape[] firstHalf= new Shape[mid-start+1];
			Shape[] secondHalf= new Shape[end-mid];
			// fill the arrays with elements for larger arrays
			for(int i=0;i<firstHalf.length;i++) {
				firstHalf[i]=shape[start+i];
			}
			for(int j=0;j<secondHalf.length;j++) {
				secondHalf[j]=shape[(mid+1)+j];
			}
			
			// i and j will work as counter which will move through till there are no elements in smaller arrays
			int i=0;
			int j=0;
			//making a loop to fill up a merged sorted array with elements of smaller arrays
			int mergedArrayIndex = start;
	while ( mergedArrayIndex <= end ) {
				// using counters to go through each element in sub arrays
		if (i < firstHalf.length && j < secondHalf.length) {
			//using compare function to compare base area or volume
			if (c.compare(firstHalf[i],secondHalf[j])>=0) {
				// if true that means element in first array is greater so it will be earlier element of sorted array as in descending order 
				shape[mergedArrayIndex] = firstHalf[i];
				i++;
			} 
			else {
				// if false that means element in second array is greater so it will be earlier element of sorted array as in descending order 
				shape[mergedArrayIndex] = secondHalf[j];
				j++;
			}
		} 
		else { 
			// if there are remaining elements in any small arrays
		  if (i < firstHalf.length) {
		shape[mergedArrayIndex] = firstHalf[i];
		i++;
		} if (j < secondHalf.length) {
		shape[mergedArrayIndex] = secondHalf[j];
		j++;
		}
		
		}
			mergedArrayIndex++;
	}
	
	}	
}
	


