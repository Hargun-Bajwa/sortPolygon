CONTENTS OF THIS FILE
-------------------------------
- Project’s title.
- The date.
- The authors.
- What the program does.
- List of deficiencies if any.
- How to run the program.
- Results



# A Project Title 
---------------------------------
ASSIGNMENT ONE: SORTING OUT SORTING


#  The date
-----------------------------------------
 Version  2021.10.07


# The author
-----------------------------------------
 Agambeer Brar     
	- Github: https://github.com/agambeer
 Hargun Singh Bajwa 
	- Github: https://github.com/Hargun-Bajwa
 Wen-chi Wu
	- Github: https://github.com/sait-wenchi
 Yoojin Park
	- Github: https://github.com/YPark123
 


# What the program does.
----------------------------------------
The program do the following tasks:
--	Reads the user input.
--	Reads a text file of polygons.(user selected by typing user input in step 1)
--	compare and sort each polygon's Height, base area or volume from the file by using  particular sorting algorithm.(user selected by typing user input in step 1)
--	The sorting is done as in descending order.(biggest to smallest).

 


# List of deficiencies if any. 
---------------------------------
Reflection is not added, It was optional.
Code is not too much general. 

# How to run the program
------------------------------------------

-- how to launch.
To start this program launch it through cmd with java -jar [sort.jar] -f[filename] –T[comparison type] –S[sorting algoritm]. (f,t,s are paramenter and can be in any order) 


-- Things to consider while launching.
         -> make sure your root directory is set to be as the project root directory.
	 -> file should be in /res directory.
	 -> comparison type could only be h for height,a for area and v for volume.
	 -> sorting algorithms could only be b for bubble,i for insertion, s for selection,m for merge, q for quick and z for cocktail shaker.
	 -> It could be that too much will be taken to read the file than the sorting itself if file is too big.
-- Example of running command.
		-> java -jar sort.jar –fpolyfor1.txt –Tv –Sb
		-> java -jar sort.jar –ta –sQ –fpolyfor3.txt
		-> java -jar sort.jar –tH –Fpolyfor5.txt –sB


# Results
------------------------------------------
The program will show the user about how much time it took to sort the list of polygons on based on its properties in the specified file with respective sorting algoritms.
It will also show the user entered property of first, last and each thousandth element of the sorted list.
