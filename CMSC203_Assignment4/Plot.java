/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description: Write an application that lets the user create a management 
 * company and add the properties managed by the company to its list. (re-submission)
 * Due: 4/4/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Miles Levine
*/
/**
 * @author Miles Levine
 *
 */

import java.util.Arrays;

public class Plot {
	/**
	 * integer variables
	 */
	private int x, y, width, depth;
	/**
	 * string variables
	 */
	private String propertyName, city, owner;
	/**
	 * double variable
	 */
	private double rentAmount;
	/**
	 * 
	 */
	private Plot plot;
	
	
	//constructors
	/**
	 * 
	 */
	Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 0;
		this.depth = 0;
	}
	
	/**
	 * @param p
	 */
	Plot(Plot p){
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	Plot(int x, int y, int width, int depth){//
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
		
	}
	
	//methods
	/*
	 * overlaps() method
	 * @param plot
	 * */
	/**
	 * @param plot
	 * @return
	 */
	public boolean overlaps(Plot plot) { 
		int plotSumX = (plot.x + plot.width);
		int sumX = (x + width);
		int plotSumY = (plot.y + plot.depth);
		int sumY = (y + depth);
		boolean bool = true;
		
		if (x < plotSumX && sumX > plot.x && y < plotSumY && plot.y < sumY) {//Returns true if this plot overlaps the parameter, false otherwise
			return bool;
		}
		else {
			bool = false;
			return bool;
		}
		
	}
	/*
	 * encompasses() method
	 * 
	 * */
	/**
	 * @param plot
	 * @return
	 */
	public boolean encompasses(Plot plot) {
		double plotSumX = (plot.getX() + plot.getWidth());
		double sumX = (x + width);
		double plotSumY = (plot.getY() + plot.getDepth());
		double sumY = (y + depth);
		boolean bool = true;
		
		if(this.x <= plot.getX() && plot.getX() <= sumX && this.y <= plot.getY() && plot.getY() <= sumY && this.x <= sumX && 
				plotSumX <= sumX && plotSumY >= this.y && plotSumY <= sumY) {//Returns true if this plot encompasses the parameter, false otherwise
				return bool;
		}
		
		else {
		return bool = false;
		}
	}
	
	
	/*
	 * getter/setter methods
	 * */
	public String getPropertyName() {//
		return propertyName;
	}

	public String getCity() {//
		return city;
	}

	public double getRentAmount() {//
		return rentAmount;
	}

	public String getOwner() {//
		return owner;
	}

	public Plot getPlot() {//
		return plot;
	}

	public int getWidth() {
		return width;
	}

	public int getDepth() {
		return depth;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
		
	}
	
	public void setY(int y) {
		this.y = y;
		
	}
	/*
	 * toString() method
	 * */
	/**
	 *
	 */
	public String toString() {
		String text = " ";
		text = ("Upper left: (" + x + "," + y + "); Width: " + width + " Depth: " + depth);
		return text;
		
	}

	
}
