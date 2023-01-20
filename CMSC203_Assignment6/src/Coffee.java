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
public class Coffee extends Beverage {
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double COST_OF_SHOT = .5;
	private final double COST_OF_SYRUP = .5;
	
	
	/**
	 * Constructor
	 * @param name
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		super(name, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}

	//Methods
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		String str = getBevName() + ", " + getSize();
		if (extraShot == true) {
			str += " Extra shot";
		}
		if (extraSyrup == true) {
			str += " Extra syrup";
		}
		
		str += ", $" + calcPrice();
		
		return str;
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
		
		if (extraShot == true) {
			price += COST_OF_SHOT;
		}
		if (extraSyrup == true) {
			price += COST_OF_SYRUP;
		}
		
		return price;
	}
	/**
	 * equals method
	 * @param c
	 * @return boolean
	 */
	public boolean equals(Coffee c) {
		boolean bool = false;
		if (super.equals(c) && extraShot == c.getExtraShot() && extraSyrup == c.getExtraSyrup()) {
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
	public boolean getExtraShot() {
		return extraShot;
	}
	/**
	 * @return
	 */
	public boolean getExtraSyrup() {
		return extraSyrup;
	}
	/**
	 * @return
	 */
	public double getCostOfShot() { 
		return COST_OF_SHOT;
	}
	/**
	 * @return
	 */
	public double getCostOfSyrup() { 
		return COST_OF_SYRUP;
	}
        
	/**
	 * @param extraShot
	 */
	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraSyrup;
	}
	/**
	 * @param extraSyrup
	 */
	public void setExtraSyrup(boolean extraSyrup) {
		this.extraSyrup = extraSyrup;
	}
}