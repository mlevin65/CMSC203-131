/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description: Create a utility class that manipulates a two-dimensional ragged array of doubles. 
 * This utility class will be used to create a Sales Report for Retail District #5. It will accommodate positive and negative numbers. 
 * Follow the Javadoc provided. Create a utility class that will calculate holiday bonuses given a ragged array of doubles which represent 
 * the sales for each store in each category. 
 * It will also take in bonus amount for the store with the highest sales in a category, the bonus amount for the store with the lowest sales in 
 * a category and the bonus amount for all other stores.
 * Due: 4/18/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Miles Levine
*/

import java.io.*;

import java.util.*;

import java.lang.*;

class TwoDimRaggedArrayUtility {
	
	
	//methods
	
	/*
	 * getAverage method
	 * @param data
	 * 
	 * */
    public static double getAverage(double[][] data) {
    	
    	double total = 0.0;
    	int elements = 0;
    	
    	//for loops that add the values of the 2-dimensional array 
    	for (int a = 0; a < data.length; a++) {
    		for (int b = 0; b < data[a].length; b++) {
    			
    			total += data[a][b];
    			
    			//each iteration of the for loops adds an element
    			elements++;
    			
    		}
    	}
    	return (total / elements);
    }
    
    /*
     * getColumnTotal method
     * 
     * @param data
     * @param col
     * 
     * */
    public static double getColumnTotal(double[][] data, int col) {
    	double total = 0.0;
    	
    	//for loop that calculates how many values of the column and stores in total
    	for (int a = 0; a < data.length; a++) {
    		if (col <= data[a].length - 1) { //zero refers to the first column
    			
    			total += data[a][col];
    		}
    	}
   	 	
    	return total;
    }
    
    /*
     * getHighestInArray method
     * 
     * @param data
     * 
     * */
    public static double getHighestInArray(double[][] data) {
    	double highest = data[0][0]; //initialize the array at the first element 
    	
    	//for loop that finds the largest element
    	for (int a = 0; a < data.length; a++) {
    		
    		for (int b = 0; b < data[a].length; b++) {
    			
    			if (data[a][b] > highest) {
    				
    				highest = data[a][b];
    			}
    		}
    	}
    	
    	return highest;
    }
    
    /*
     * getHighestInColumn method
     * 
     * @param data
     * @param col
     * 
     * */
	public static double getHighestInColumn(double[][] data, int col) {
		//double largest = Double.MIN_VALUE;
		double largest = 0.0; //initialize variable for storing the largest element
		
		for (int row = 0; row < data.length; row++) {
			
			if(col < data[row].length && data[row][col] > largest) {
				//stores the largest element
				largest = data[row][col]; 
			}
		}
		
		return largest;
	}
	
	/*
	 * getHighestInColumnIndex method
	 * 
	 * @param data
	 * @param col
	 * 
	 * */
	public static int getHighestInColumnIndex(double[][] data, int col) {
		int highestIndex = 0; //initialize variable for storing the index of the largest element
    	
    	for (int a = 0; a < data.length; a++) {
    		
    		if (data[a].length > col) {
    			
    			if (data[a][col] > data[highestIndex][col]) {
    				//if the 2D array's columns are grater than the previous then it will become the highest
    				highestIndex = a;
    			}
    		}
    	}
    	
    	return highestIndex;
    }
    
    /*
     * getHighestInRow method
     * 
     * @param data
     * @param row
     * 
     * */
    public static double getHighestInRow(double[][] data, int row) {
    	double largest = data[row][0];
    	
    	//for loop that finds the largest
    	for (int b = 0; b < data[row].length; b++) {
    		if (data[row][b] > largest) {
    			
    			largest = data[row][b];
    		}
    	}
    	
    	return largest;
    }
	
    /*
     * getHighestInRowIndex method
     * 
     * @param data
     * @param row
     * 
     * */
    public static int getHighestInRowIndex(double[][] data, int row) {
    	int highestIndex = 0;
   	 	
    	for (int count = 0; count < data[row].length; count++) {
    		if (data[row][count] > data[row][highestIndex]) {
    			//if the 2D array's rows are grater than the previous then it will become the highest
    			highestIndex = count;
    		}
    	}
   	 	
    	return highestIndex;
    }
    
    /*
     * getLowestInArray method
     * 
     * @param data
     * 
     * */
    public static double getLowestInArray(double[][] data) {
    	double smallest = data[0][0];
    	
    	//finds the smallest element
    	for (int a = 0; a < data.length; a++) {
    		
    		for (int b = 0; b < data[a].length; b++) {
    			
    			if (data[a][b] < smallest) {
    				
    				smallest = data[a][b];
    			}
    		}
    	}
    	
    	return smallest;
    }
    
    /*
     * getLowestInColumn method
     * 
     * @param data
     * @param col
     * 
     * */
	public static double getLowestInColumn(double[][] data, int col) {
		
		double smallest = Double.MAX_VALUE;
		
		//finds the smallest element of the column
		for (int row = 0; row < data.length; row++) {
			
			if (col < data[row].length) {
				if (data[row][col] < smallest) {
					smallest = data[row][col];
				}
			}
		}
		return smallest;
		
	}
	
	/*
	 * getLowestInColumnIndex method
	 * 
	 * @param data
	 * @param col
	 * 
	 * */
    public static int getLowestInColumnIndex(double[][] data, int col) {
    	int smallestIndex = 0;
    	
    	//finds the index of the smallest element of the column
    	for (int a = 0; a < data.length; a++) {
    		
    		if (data[a].length > col) {
    			
    			if (data[a][col] < data[smallestIndex][col]) {
    				
    				smallestIndex = a;
    			}
    		}
    	}
    	
    	return smallestIndex;
    }
    
    /*
     * getLowestInRow method
     * 
     * @param data
     * @param row
     * 
     * */
    public static double getLowestInRow(double[][] data, int row) {
    	double smallest = data[row][0];
    	
    	//finds the smallest element of the row
   	 	for (int b = 0; b < data[row].length; b++) {
   	 		if (data[row][b] < smallest) {
   	 			
   	 			smallest = data[row][b];
   	 		}
   	 	}
   	 	
   	 	return smallest;
    }
    
    /*
     * getLowestInRowIndex method
     * 
     * @param data
     * @param row
     * 
     * */
    public static int getLowestInRowIndex(double[][] data, int row) {
    	int smallestIndex = 0;
    	
    	//finds the index of the smallest element of the row
    	for (int a = 0; a < data[row].length; a++) {
    		
    		if (data[row][a] < data[row][smallestIndex]) {
    			
    			smallestIndex = a;
    		}
    	}
    	
    	return smallestIndex;
    }
    
    /*
     * getRowTotal method
     * 
     * @param data
     * @param row
     * 
     * */
    public static double getRowTotal(double[][] data, int row) {
    	double total = 0;
    	
    	//calculates the total for each row
    	for (int b = 0; b < data[row].length; b++) {
    		
    		total += data[row][b];
    		
    	}
    	return total;
    	
    }
    
    /*
     * getTotal method
     * 
     * @param data
     * 
     * */
    public static double getTotal(double[][] data) {
    	double total = 0;
    	
    	//calculates the total of all the elements for the 2D array
    	for (int a = 0; a < data.length; a++) {
    		for (int b = 0; b < data[a].length; b++) {
    			total += data[a][b];
    		}
    	}
    	return total;
    	
    }
    
    /*
     * readFile method
     * 
     * @param file
     * 
     * */
    public static double[][] readFile(File file) {
    	double[][] array = null;
    	String text;
		int rows = 0;
    	try {
    		//open the file
    		Scanner input = new Scanner(file);
    		
    		while(input.hasNextLine()){
    			++rows;
    			input.nextLine();
    		}
    		
    		input.close();
    		
    		input = new Scanner(file);
    		array = new double[rows][];
    		
    		for(int a = 0; a < array.length; a++){
    			text = input.nextLine();
    			String[] values = text.split(" ");
    			array[a] = new double[values.length];
    			
    			for(int b = 0; b < array[a].length; b++){
    				//convert to double
    				array[a][b] = Double.valueOf(values[b]);
    			}
    		}
    		//close the file
    		input.close();
    	} 
    	catch (IOException e) {
    		e.printStackTrace();
    	}
    	return array;
    }

    /*
     * writeToFile method
     * 
     * @param data
     * @param outputFile
     * 
     * */
    public static void writeToFile(double[][] data, File outputFile) {
    	try {
    		 
    		//opens the file
    		 
    		BufferedWriter file = new BufferedWriter(new FileWriter(outputFile));
    		
    		//for loop that reads the array
    		for (int a = 0; a < data.length; a++) {
    			for (int b = 0; b < data[a].length; b++) {
    				file.write(data[a][b] + " "); //prints into file with spaces
    			}
    			 
    			file.newLine();
    		}
    		//closes the file
    		file.close();
    	}
    	 
    	catch (IOException e) {
    		e.printStackTrace();
    		 
    	}
    	
    }
         
}