/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description:Bradley shop is a family-owned store that sells beverages.  
 * The store offers 3 types of beverages: Coffee, Alcohol, and Smoothie. 
 * The store is open from 8 in the morning to 11 pm in the afternoon.
 * Due: 5/2/2022
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
public class Alcohol extends Beverage {

    /**
     * Used for storing if the day is a weekend or not
     */
    private boolean weekend;
    /**
     * Variable for storing the extra cost
     */
    private final double WEEKEND_COST = .6;
    
    /**
     * Constructor
     * @param name
     * @param size
     * @param weekend
     */
    public Alcohol(String name, SIZE size, boolean weekend) {
    	super(name, TYPE.ALCOHOL, size);
    	this.weekend = weekend;
    }
    
    /**
     * String representation of a alcohol drink including the name, size, 
     * whether or not beverage is offered in the weekend and the price.
     */
    public String toString() {
    	String str = getBevName() + ", " +getSize();
    	
    	if (weekend) {
    		str += " Weekend";
            }
    	
    	str += ", $" + calcPrice();
    	
    	return str;
    }
    /**
     * checks equality based on the Beverage class equals method and 
     * additional instance variables for this class.
     * @param a
     * @return boolean
     */
    public boolean equals(Alcohol a) {
    	boolean bool = false;
    	if (super.equals(a) && weekend == a.getWeekend()) {
    		bool = true;
    		return bool;
    	}
    	else {
    		return bool;
    	}
    }

    /**
     * calcPrice method
     */
    public double calcPrice() {
    	double price = super.getBasePrice();
    	
    	if (super.getSize() == SIZE.MEDIUM) {
    		price += super.getSizePrice();
    	}
    	else if (super.getSize() == SIZE.LARGE) {
    		price += 2 * super.getSizePrice();
    	}
    	
    	if (weekend == true) {
    		price += WEEKEND_COST;
    	}
    	
    	return price; 
    }
    
    /**
     * @return
     */
    public boolean getWeekend() {
    	return weekend;
    }
    /**
     * @return
     */
    public double getWeekendCost() {
    	return WEEKEND_COST;
    }
    
    /**
     * @param weekend
     */
    public void setWeekend(boolean weekend) {
    	this.weekend = weekend;
    }
    
}
