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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HolidayBonusTestSTUDENT {
	
	private double[][] dataSetSTUDENT = {{3,4,9},{2,3},{4,6,1}};
	private double[][] dataSetSTUDENT2 = {{3,6,1,2},{3},{7,3,0},{15,2,3,8}};


	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
		/**
		 * Test calculateHolidayBonus method with a high of 5000, low of 1000 and 2000 as other
		 */

		@Test
		public void testCalculateHolidayBonusA() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,5000,1000,2000);
			assertEquals(9000.0,result[0],.001);
			assertEquals(2000.0,result[1],.001);
			assertEquals(11000.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT2,5000,1000,2000);
			assertEquals(9000.0,result[0],.001);
			assertEquals(1000.0,result[1],.001);
			assertEquals(4000.0,result[2],.001);
			assertEquals(16000.0,result[3],.001);
			

			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}
		

		/**
		 * Test calculateHolidayBonus method with a high of 1250, low of 100 and 700 as other
		 */

		@Test
		public void testCalculateHolidayBonusB() {
			try{
			double[] result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT,1250,100,700);
			assertEquals(2650.0,result[0],.001);
			assertEquals(200.0,result[1],.001);
			assertEquals(2600.0,result[2],.001);
			
			result = HolidayBonus.calculateHolidayBonus(dataSetSTUDENT2,1250,100,700);
			assertEquals(2150.0,result[0],.001);
			assertEquals(100.0,result[1],.001);
			assertEquals(1400.0,result[2],.001);
			assertEquals(3850.0,result[3],.001);
			

			}
			catch (Exception e) {
				fail("This should not have caused an Exception");
			} 
			
		}

		/**
		 * Test calculateTotalHolidayBonus method with a high of 7839, low of 839 and 2839 as other
		 */
	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(31712.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 7839, 839, 2839),.001);
		assertEquals(43229.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT2, 7839, 839, 2839),.001);


	}
	
	/** 
	 * Test calculateTotalHolidayBonus method with a high of 8382, low of 109 and 307 as other
	 */
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(26087.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT, 8382,109,307),.001);
		assertEquals(34885.0,HolidayBonus.calculateTotalHolidayBonus(dataSetSTUDENT2, 8382,109,307),.001);


	}

}