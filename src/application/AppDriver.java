package application;

import java.io.FileNotFoundException;
import java.util.Scanner;

import comparator.AreaCompare;
import comparator.VolumeCompare;
import shape.Shape;
import sorts.Bubble;
import sorts.CocktailShakerSort;
import sorts.Insertion;
import sorts.Merge;
import sorts.Quick;
import sorts.Selection;

/**
 * AppDriver Class
 *@author Agambeer Brar, argun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */

public class AppDriver {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException{	
		
		
		long start, stop;
		
		SortManager sm = new SortManager();
		
		try {
			//Process information from arguments
			String[] inputs = new String[3];
	        
			for(int i=0; i < args.length; i++) {
				char identifier = Character.toUpperCase(args[i].charAt(1));
				
				if(identifier == 'F' || identifier == 'T' ||identifier == 'S') {
					switch(identifier) {
					case 'F': inputs[0] = args[i].substring(2); break;
					case 'T': inputs[1] = args[i].substring(2); break;
					case 'S': inputs[2] = args[i].substring(2);	}
				}
				else {
					System.out.println("Invalid Input");
					return;
				}
			}
			
			String userPath = "res/"+ inputs[0].replaceAll("\\s",""); //file name
			String compareType = inputs[1].toUpperCase().replaceAll("\\s","");
			String sortType = inputs[2].toUpperCase().replaceAll("\\s","");
			
			//Populate the shape list from text file.		
			Shape[] shapeList= (Shape[]) sm.fileShapeList(userPath);
			
			
			//1. Compare Type : Height
			
			if(compareType.equals("H")) {
				if(sortType.equals("B") || sortType.equals("S") ||sortType.equals("I") || 
						sortType.equals("M") || sortType.equals("Q") ||sortType.equals("Z")) {
					start = System.currentTimeMillis();
					switch(sortType) {
					case "B": Bubble.sort(shapeList); break;
					case "S": Selection.sort(shapeList); break;
					case "I": Insertion.sort(shapeList); break;
					case "M": Merge.sort(shapeList); break;
					case "Q": Quick.sort(shapeList); break;
					case "Z": CocktailShakerSort.sort(shapeList); break;}
					
					
					stop = System.currentTimeMillis();
					System.out.printf("first: %4.3e \n",shapeList[0].getHeight());
					for(int i=999;i<shapeList.length-1;i+=1000)
						System.out.printf("%d: %4.3e \n",i,shapeList[i].getHeight());
					System.out.printf("last: %4.3e \n", shapeList[shapeList.length-1].getHeight());
				
				   	
					System.out.println("Time Taken : "+(stop-start)+" Milliseconds");
				}
				else {
					System.out.println("Invalid Input");
				}
			}
			
			
			//2. Compare Type : Volume
			else if(compareType.equals("V") || compareType == "V") {
				VolumeCompare volume = new VolumeCompare();
				
				if(sortType.equals("B") || sortType.equals("S") ||sortType.equals("I") || 
						sortType.equals("M") || sortType.equals("Q") ||sortType.equals("Z")) {
					start = System.currentTimeMillis();
					switch(sortType) {
						case "B": Bubble.sort(shapeList, volume); break;
						case "S": Selection.sort(shapeList, volume); break;
						case "I": Insertion.sort(shapeList, volume); break;
						case "M": Merge.sort(shapeList, volume); break;
						case "Q": Quick.sort(shapeList, volume); break;
						case "Z": CocktailShakerSort.sort(shapeList, volume); break;}
					
					stop = System.currentTimeMillis();
				   	
				   	
					//Print shape value(volume) in order [ first, every thousandth, last]
				   	System.out.printf("first: %4.3e \n",shapeList[0].calcVolume());
					for(int i=999;i<shapeList.length-1;i+=1000)
						System.out.printf("%d: %4.3e \n",i+1,shapeList[i].calcVolume());
					System.out.printf("last: %4.3e \n", shapeList[shapeList.length-1].calcVolume());
				
					System.out.println("Time Taken : "+(stop-start)+" Milliseconds");
				}
				else {
					System.out.println("Invalid Input");
				}
				
				
				
			}
			
			//3. Compare Type : Base Area
			else if(compareType.equals("A") || compareType == "A") {
				AreaCompare area = new AreaCompare();

				if(sortType.equals("B") || sortType.equals("S") ||sortType.equals("I") || 
						sortType.equals("M") || sortType.equals("Q") ||sortType.equals("Z")) {
					start = System.currentTimeMillis();
					switch(sortType) {
						case "B": Bubble.sort(shapeList, area); break;
						case "S": Selection.sort(shapeList, area); break;
						case "I": Insertion.sort(shapeList, area); break;
						case "M": Merge.sort(shapeList, area); break;
						case "Q": Quick.sort(shapeList, area); break;
						case "Z": CocktailShakerSort.sort(shapeList, area); break;}
					
					stop = System.currentTimeMillis();
				   	
					//Print shape value(BaseArea) in order [ first, every thousandth, last]
				   	System.out.printf("first: %4.3e \n",shapeList[0].calcBaseArea());
					for(int i=999;i<shapeList.length-1;i+=1000)
						System.out.printf("%5d: %4.3e \n",i+1,shapeList[i].calcBaseArea());
					System.out.printf("last : %4.3e \n", shapeList[shapeList.length-1].calcBaseArea());
				   	
					System.out.println("Time Taken : "+(stop-start)+" Milliseconds");
				}
				else {
					System.out.println("Invalid Input");
				}
			}
			//4. Invalid Input (not in case of H, V, A) 
			else {
				System.out.println("Invalid Input");
			}
			

	    }
	    catch (ArrayIndexOutOfBoundsException e){
	        System.out.println("ArrayIndexOutOfBoundsException caught");
	    }
		
		catch(NullPointerException e) {
			System.out.println("NullPointerException caught");
		}
	    finally {

	    }

		
		
	
	}
}