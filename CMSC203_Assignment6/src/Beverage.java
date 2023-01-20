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
public abstract class Beverage {
	//fields
    private String name;
    private TYPE type;
    private SIZE size;
    private final double BASE_PRICE = 2.0;
    private final double SIZE_PRICE = 1.0;
    
    //Constructor
    /**
     * Constructor
     * @param name
     * @param type
     * @param size
     */
    public Beverage(String name, TYPE type, SIZE size) {
    	this.name = name;
    	this.type = type;
    	this.size = size;
    }
    
    //Methods
    public abstract double calcPrice();//calculates and returns the beverage price
    
    /**
     * toString method
     * String representation for Beverage including the name and size
     * @return String
     */
    public String toString() {
    	return name + ", " + size;
    }
    
    /**
     * equals method
     * checks equality based on name, type, size of the beverage
     * @param b
     * @return boolean
     */
    public boolean equals(Beverage b) {
    	boolean bool = false;
    	if (name.equals(b.getBevName()) && type == b.getType() && size == b.getSize()) {
    		bool = true;
    		return bool;
    	}
    	else {
    		return bool;
    	}
    }
    
    
    /**
     * @return
     */
    public String getBevName() {
            return name;
    }
    /**
     * @return
     */
    public TYPE getType() {
            return type;
    }
    /**
     * @return
     */
    public SIZE getSize() {
            return size;
    }
    /**
     * @return
     */
    public double getBasePrice() {
            return BASE_PRICE;
    }
    /**
     * @return
     */
    public double getSizePrice() {
            return SIZE_PRICE;
    }
    
    
    /**
     * @param name
     */
    public void setName(String name) {
            this.name = name;
    }
    /**
     * @param type
     */
    public void setType(TYPE type) {
            this.type  = type;
    }
    /**
     * @param size
     */
    public void setSize(SIZE size) {
            this.size = size;
    }
}
