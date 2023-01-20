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

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENT_Test {
	//STUDENT fill in dataSetSTUDENT with values, it must be a ragged array
	private double[][] dataSetSTUDENT = {{3,6,7,2},{4,9},{2,9,3,2}};
	private double[][] dataSetSTUDENT2 = {{5,8,2,4},{2,1,7},{9,7,4,3},{6,3,7,9,8}};
	private File inputFile,outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = dataSetSTUDENT2 = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method
	 * Return the total of all the elements in the two dimensional array
	 */
	@Test
	public void testGetTotal() {
		assertEquals(47.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT),.001);
		assertEquals(85.0,TwoDimRaggedArrayUtility.getTotal(dataSetSTUDENT2),.001);	
	}

	/**
	 * Student Test getAverage method
	 * Return the average of all the elements in the two dimensional array
	 */
	@Test
	public void testGetAverage() {
		assertEquals(4.7,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT),.001);
		assertEquals(5.3125,TwoDimRaggedArrayUtility.getAverage(dataSetSTUDENT2),.001);
	}

	/**
	 * Student Test getRowTotal method
	 * Return the total of all the elements of the row.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		assertEquals(13.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT,1),.001);
		assertEquals(10.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT2,1),.001);
		assertEquals(19.0,TwoDimRaggedArrayUtility.getRowTotal(dataSetSTUDENT2,0),.001);
		
		//fail("Student testGetRowTotal not implemented");	
	}


	/**
	 * Student Test getColumnTotal method
	 * Return the total of all the elements in the column. If a row in the two dimensional array
	 * doesn't have this column index, it is not an error, it doesn't participate in this method.
	 * Column 0 refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT,0),.001);
		assertEquals(20.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSetSTUDENT2,2),.001);
		
		
		//fail("Student testGetColumnTotal not implemented");	
	}


	/**
	 * Student Test getHighestInArray method
	 * Return the largest of all the elements in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT,0),.001);
		assertEquals(7.0,TwoDimRaggedArrayUtility.getHighestInRow(dataSetSTUDENT2,1),.001);
		
		
		//fail("Student testGetHighestInArray not implemented");	
	}
	

	/**
	 * Test the writeToFile method
	 * write the array to the outputFile File
	 * then read it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array=null;
		try {
			TwoDimRaggedArrayUtility.writeToFile(dataSetSTUDENT, outputFile);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}
		array = TwoDimRaggedArrayUtility.readFile(outputFile);
		assertEquals(3.0, array[0][0],.001);
		assertEquals(6.0, array[0][1],.001);
		assertEquals(7.0, array[0][2],.001);
		assertEquals(4.0, array[1][0],.001);
		assertEquals(9.0, array[1][1],.001);
		assertEquals(2.0, array[2][0],.001);
		assertEquals(9.0, array[2][1],.001);
		

		
		
		
		
		//fail("Student testWriteToFile not implemented");	
	}

}
