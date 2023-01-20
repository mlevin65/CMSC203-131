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

public class HolidayBonus {

	public static double[] calculateHolidayBonus(double[][] data, double high, double low, double other) {
        double highSales = 0;
        double lowSales = 0;
		// Calculates the bonus amounts for the stores
		double[] storeBonuses = new double[data.length]; //
		
		for (int row = 0; row < data.length; row++) {
			
			for (int column = 0; column < data[row].length; column++) {
				
				//call method from TwoDimRaggedArrayUtility class to calculate the highest sales for column
	            highSales = TwoDimRaggedArrayUtility.getHighestInColumn(data, column);
	            
	            //call method from TwoDimRaggedArrayUtility class to calculate the lowest sales for column
	            lowSales = TwoDimRaggedArrayUtility.getLowestInColumn(data, column);
	            
	            if(data[row][column] > 0) {
	            	
	                if(data[row][column] == highSales) { //if highest, add to the store's bonus
	                	storeBonuses[row] = (storeBonuses[row] + high);
	                }
	                
	                else if(data[row][column] == lowSales) { //if lowest, then add to the store's bonus
	                	
	                	storeBonuses[row] = storeBonuses[row] + low;
	                }
	                
	                else {
	                	// if neither lowest nor highest, then add the other bonus amount to the store
	                	storeBonuses[row] = storeBonuses[row] + other;
	                }
	            }
			}
		}
		return storeBonuses;
	}
	
	public static double calculateTotalHolidayBonus(double[][] data, double high, double low, double other) {
		//create a variable to hold the total
		double totalHolidayBonus = 0;
		
		for(int index = 0; index < data.length; index++) {// for loop that adds the bonus amounts for each store
			
			totalHolidayBonus += calculateHolidayBonus(data, high, low, other)[index];
		}
		return totalHolidayBonus;
	}
	
}
	
