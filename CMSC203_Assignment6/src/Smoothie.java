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
 public class Smoothie extends Beverage {
	private int numOfFruits;
	private boolean proteinPowder;
	private final double COST_OF_FRUIT = .5;
	private final double COST_OF_PROTEIN = 1.5;
	
	/**
	 * Constructor
	 * @param name
	 * @param size
	 * @param numOfFruits
	 * @param proteinPowder
	 */
	public Smoothie(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
		super(name, TYPE.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.proteinPowder = proteinPowder;
	}
    
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		String str = getBevName() + ", " + getSize() + " " + numOfFruits + " Fruits";
		
		if (proteinPowder) {
			str += " Protein powder";
		}
		
		str += ", $" + calcPrice();
		
		return str;
	}
	/**
	 * equals method
	 * @param s
	 * @return boolean
	 */
	public boolean equals(Smoothie s) {
		boolean bool = false;
		if (super.equals(s) && numOfFruits == s.getNumOfFruits() && proteinPowder == s.getAddProtein()) {
			bool = true;
			return bool;
		}
		else {
			return bool;
		}
	}
	/**
	 * calcPrice method
	 * @return double
	 */
	public double calcPrice() {
		double price = super.getBasePrice();
		
		if (super.getSize() == SIZE.MEDIUM) {
			price += super.getSizePrice();
		}
		else if (super.getSize() == SIZE.LARGE) {
			price += 2 * super.getSizePrice();
		}
		
		price += numOfFruits * COST_OF_FRUIT;
		if (proteinPowder == true) {
			price += COST_OF_PROTEIN;
		}
		
		return price;
	}
	
	/**
	 * @return
	 */
	public int getNumOfFruits() {
		return numOfFruits;
	}
	/**
	 * @return
	 */
	public boolean getAddProtein() {
		return proteinPowder;
	}
    /**
     * @return
     */
    public double getCostOfFruit() {
    	return COST_OF_FRUIT;
    }
    /**
     * @return
     */
    public double getCostOfProtein() {
    	return COST_OF_PROTEIN;
    }
    
    /**
     * @param numOfFruits
     */
    public void setNumOfFruits(int numOfFruits) {
    	this.numOfFruits = numOfFruits;
    }
    /**
     * @param proteinPowder
     */
    public void setProteinPowder(boolean proteinPowder) {
    	this.proteinPowder = proteinPowder;
    }

}
