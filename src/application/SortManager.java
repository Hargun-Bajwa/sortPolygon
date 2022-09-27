package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import shape.Cone;
import shape.Cylinder;
import shape.OctagonalPrism;
import shape.PentagonalPrism;
import shape.Prism;
import shape.Pyramid;
import shape.Shape;
import shape.SquarePrism;
import shape.TriangularPrism;
/**
 * SortManager Class
 *@author Agambeer Brar, argun Bajwa, Wen-Chi Wu, Yoojin Park (list by alphabet)
* @version 2021-10-07
 *
 */

public class SortManager {
	
	private Shape list[];
	
	/**
	 * Process information from user's input and create the list
	 * @param path the file path from the user's input.
	 * @return the shape list from text file
	 * @exception FileNotFoundException if file is not found
	 */
	
	public Shape[] fileShapeList(String path) throws FileNotFoundException{

		File file = new File(path); 
	
		Scanner fileIn = new Scanner(file).useDelimiter(" ");
		
		int numberOfShapes= fileIn.nextInt();
		Shape list[] = new Shape[numberOfShapes];
		int i = 0;
		while(fileIn.hasNext())
		{
			switch(fileIn.next().toUpperCase()) {
				case "CYLINDER":
					list[i] = new Cylinder(fileIn.nextDouble(),fileIn.nextDouble());
					break;
					
				case "PYRAMID":
					list[i] = new Pyramid(fileIn.nextDouble(),fileIn.nextDouble());
					break;
					
				case "CONE":
					list[i] = new Cone(fileIn.nextDouble(),fileIn.nextDouble());
					break;
				
				case "OCTAGONALPRISM":
					list[i] = new OctagonalPrism(fileIn.nextDouble(),fileIn.nextDouble());
					break;
					
				case "PENTAGONALPRISM":
					list[i] = new PentagonalPrism(fileIn.nextDouble(),fileIn.nextDouble());
					break;				
					
				case "SQUAREPRISM":
					list[i] = new SquarePrism(fileIn.nextDouble(),fileIn.nextDouble());
					break;
					
				case "TRIANGULARPRISM":
					list[i] = new TriangularPrism(fileIn.nextDouble(),fileIn.nextDouble());
					break;
					
			}
			i++;
					
		}
		
		fileIn.close();
		return list;
	}

}
