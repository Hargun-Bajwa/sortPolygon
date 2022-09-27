package application;
import shape.*;
import sorts.*;

import java.util.Scanner;

import comparator.*;
public class TestCode {

	public static void main(String[] args) throws Exception{
		
		//Shape[] shape=createTest();
		long start, stop;
		
		System.out.println("File is polyfor1.txt on which all these operations will be held");
		
		SortManager sm = new SortManager();
		Shape[] shapes= (Shape[]) sm.fileShapeList("res/polyfor1.txt");
		
		
		start =System.currentTimeMillis();
		Merge.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("Merging by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		AreaCompare areaM = new AreaCompare();
		Merge.sort(shapes, areaM);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Merging by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		VolumeCompare volumeM = new VolumeCompare();
		Merge.sort(shapes, volumeM);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Merging by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		Bubble.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("Bubble sort by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		AreaCompare areab = new AreaCompare();
		Bubble.sort(shapes, areab);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Bubble sort by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		VolumeCompare volumeb = new VolumeCompare();
		Bubble.sort(shapes, volumeb);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Bubble sort by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		CocktailShakerSort.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("CocktailShaker Sort by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		AreaCompare areaZ = new AreaCompare();
		CocktailShakerSort.sort(shapes, areaZ);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("CocktailShakerSort  by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		VolumeCompare volumeZ = new VolumeCompare();
		CocktailShakerSort.sort(shapes, volumeZ);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("CocktailShaker Sort by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		Insertion.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("Insertion sort by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		AreaCompare areaI = new AreaCompare();
		Insertion.sort(shapes, areaI);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Insertion sort by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		VolumeCompare volumeI = new VolumeCompare();
		Insertion.sort(shapes, volumeI);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Insertion sort by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		Quick.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("Quick Sort by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		AreaCompare areaQ = new AreaCompare();
		Quick.sort(shapes, areaQ);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Quick Sort by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		VolumeCompare volumeQ = new VolumeCompare();
		Quick.sort(shapes, volumeQ);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Quick Sort by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		Selection.sort(shapes);
		stop = System.currentTimeMillis();
		//Print shape value(Height) in order [ first, every thousandth, last]
		System.out.printf("first: %4.3e \n",shapes[0].getHeight());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%d: %4.3e \n",i+1,shapes[i].getHeight());
		System.out.printf("last: %4.3e \n", shapes[shapes.length-1].getHeight());
		
		System.out.println("Selection Sort by height done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		
		start =System.currentTimeMillis();
		AreaCompare areaS = new AreaCompare();
		Selection.sort(shapes, areaS);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Selection Sort by Base Area done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		System.out.println("");
		System.out.println("");
		start =System.currentTimeMillis();
		VolumeCompare volumeS = new VolumeCompare();
		Selection.sort(shapes, volumeS);
		//Print shape value(BaseArea) in order [ first, every thousandth, last]
	   	System.out.printf("first: %4.3e \n",shapes[0].calcBaseArea());
		for(int i=999;i<shapes.length-1;i+=1000)
			System.out.printf("%5d: %4.3e \n",i+1,shapes[i].calcBaseArea());
		System.out.printf("last : %4.3e \n", shapes[shapes.length-1].calcBaseArea());
				stop = System.currentTimeMillis();
		
		System.out.println("Selection Sort by volume done");
		System.out.println("Time Taken: " +(stop-start)+" Milliseconds");
		
		
		


//		System.out.println("Original Shapes list:");
//		for(int i=0;i<shapes.length-1;i++)
//		{
//			System.out.println(shapes[i].getHeight());
//		}
//		
//		start = System.nanoTime();System.nanoTime();;
//    	
//    	System.out.println();
//    	Merge.sort(shapes);
//    	System.out.println();
//		System.out.println(shapes[0].getHeight());
//		System.out.println("height Shapes list:");
//    	for(int i=0;i<shapes.length-1;i++)
//    	
//		{
//			System.out.printf(" %s",shapes[i].getHeight());
//		}
//		
//		
//		AreaCompare areaS = new AreaCompare();
//		Merge.sort(shapes, areaS);
//		System.out.println();
//				System.out.println(shapes[0].getHeight());
//				System.out.println("area Shapes list:");
//		    	for(int i=0;i<shapes.length-1;i++)
//		    	
//				{
//					System.out.printf(" %s",shapes[i].getHeight());
//				}
//		
//		VolumeCompare volumeS = new VolumeCompare();
//		Merge.sort(shapes, volumeS);
//		System.out.println();
//		System.out.println(shapes[0].getHeight());
//		System.out.println("volume Shapes list:");
//    	for(int i=0;i<shapes.length-1;i++)
//    	
//		{
//			System.out.printf(" %s",shapes[i].getHeight());
//		}
//		
//		stop = System.nanoTime();
//		System.out.println();
//    	System.out.println("Time taken:"+ (stop-start));
    	
//		start = System.nanoTime();System.nanoTime();;
//    	
//    	System.out.println();
//    	Insertion.sort(shapes);
//		System.out.println(shapes[1].getHeight());
//		
//		
//		AreaCompare areaI = new AreaCompare();
//		Insertion.sort(shapes, areaI);
//				System.out.println(shapes[1].getHeight());
//		
//		VolumeCompare volumeI = new VolumeCompare();
//		Insertion.sort(shapes, volumeI);
//		System.out.println(shapes[1].getHeight());
//		
//    	stop = System.nanoTime();
//    	System.out.println(stop-start); for(int i=0;i<shapes.length-1;i++)
//		{
//			System.out.printf(" %s\n",shapes[i].getHeight());
//		}
//		
//		start = System.nanoTime();System.nanoTime();;
//    	
//     	System.out.println();
//		CocktailShakerSort.sort(shapes);
//		System.out.println(shapes[1].getHeight());
//		 
//		AreaCompare areaC = new AreaCompare();
//		CocktailShakerSort.sort(shapes, areaC);
//		System.out.println(shapes[1].getHeight());
//		
//		VolumeCompare volumeC = new VolumeCompare();
//		CocktailShakerSort.sort(shapes, volumeC);
//		System.out.println(shapes[1].getHeight());
//	
//   	stop = System.nanoTime();System.nanoTime();;
//   	System.out.println(stop-start); for(int i=0;i<shapes.length-1;i++)
//	{
//		System.out.printf(" %s\n",shapes[i].getHeight());
//	}
//   	
//    	
//		
//    	start = System.nanoTime();System.nanoTime();;
//    	
//    	System.out.println();
//		Bubble.sort(shapes);
//		System.out.println(shapes[1].getHeight());
//		
//		
//		AreaCompare areaB = new AreaCompare();
//		Bubble.sort(shapes, areaB);
//				System.out.println(shapes[1].getHeight());
//		
//		VolumeCompare volumeB = new VolumeCompare();
//		Bubble.sort(shapes, volumeB);
//		System.out.println(shapes[1].getHeight());
//		
//    	stop = System.nanoTime();System.nanoTime();;
//    	System.out.println(stop-start); for(int i=0;i<shapes.length-1;i++)
//		{
//			System.out.printf(" %s\n",shapes[i].getHeight());
//		}
//    	
    	
    	
	}
//	public static Shape[] createTest() {// This code is just for testing 
//		Shape[] shapes = new Shape[10000];
//		
//		
//		for (int i=1; i<10000;i++) {
//			  {shapes[i]= new Cone(i/2,i*3);}
//		}
//		shapes[0]=new Cone(0.001,0.0001);
//		return shapes;
//		
//	}

}
