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

import java.util.ArrayList;
import java.util.Random;


/**
 * @author Miles Levine
 *
 */
public class Order implements OrderInterface, Comparable<Order> {
	private int orderNum;
	private int orderTime;
	private DAY orderDay;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	
	/**
	 * Constructor
	 * @param orderTime
	 * @param orderDay
	 * @param c
	 */
	public Order(int orderTime, DAY orderDay, Customer c) {
		orderNum = genOrderNum();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		customer = c;
		beverages = new ArrayList<>();
	}
	
	/**
	 * isWeekend method
	 * @return boolean
	 */
	public boolean isWeekend() {
		if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
			return true;
		}
		return false;
	}
	
	/**
	 * getBeverage method
	 * @param itemNumber
	 * @return beverages
	 */
	public Beverage getBeverage(int itemNumber) {
		return beverages.get(itemNumber);
	}

	/**
	 * 1st addNewBeverage method for coffee
	 * @param name
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		Coffee c = new Coffee(name, size, extraShot, extraSyrup);
		beverages.add(c);
	}
	/**
	 * 2nd addNewBeverage method for alcohol
	 * @param name
	 * @param size
	 */
	public void addNewBeverage(String name, SIZE size) {
		Alcohol a = new Alcohol(name, size, isWeekend());
		beverages.add(a);
	}
	/**
	 * 3rd addNewBeverage method for smoothie
	 * @param name
	 * @param size
	 * @param numOfFruits
	 * @param proteinPowder
	 */
	public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
		Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
		beverages.add(s);
	}
	/**
	 * calcOrderTotal method
	 * @return double
	 */
	public double calcOrderTotal() {
		double total = 0;
		
		for (Beverage b : beverages) {
			total += b.calcPrice();
		}
		
		return total;
	}
	
	/**
	 * findNumOfBeveType method
	 * @param type
	 * @return integer
	 */
	public int findNumOfBeveType(TYPE type) {
		int count = 0;
		
		for (Beverage b : beverages) {
			if (b.getType() == type) {
				count++;
			}
		}
		
		return count;
	}
	
	/**
	 * compareTo method
	 * @param o
	 * @return integer
	 */
	public int compareTo(Order o) {
		if (orderNum == o.getOrderNo()) {
			return 0; //returns 0 if the order num is the same as another order's num
		}
		else if (orderNum > o.getOrderNo()) {
			return 1; //returns 1 if the num is greater than another order's num
		}
		else {
			return -1; //returns -1 if num is less than the order's numb
		}
	}
	
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		String str = "___________________________________"
				+ orderDay.toString() + ", " + orderTime
				+ "\n" + customer.toString() + " Order Num: " + orderNum;
		
		for (Beverage b : beverages) {
			str += "\n" + b.toString();
		}
		str += "\n Order Total: " + calcOrderTotal();
		
		return str;
	}
	
	/**
	 * genOrderNum method
	 * A method to generate a random number within the range of 10000 and 90000
	 * @return integer
	 */
	public int genOrderNum() {
		int num;
		Random random = new Random();
		num = random.nextInt(10000, 90000 + 1);
		return num;
	}
	
	/**
	 * @return
	 */
	public int getOrderNo() {
		return orderNum;
	}
	/**
	 * @return
	 */
	public int getOrderTime() {
		return orderTime;
	}
	/**
	 * @return
	 */
	public DAY getOrderDay() {
		return orderDay;
	}
	/**
	 * @return
	 */
	public Customer getCustomer() {
		return new Customer(customer);
	}
	/**
	 * @return
	 */
	public ArrayList<Beverage> getBeverages() {
		return beverages;
	}
	/**
	 * @return
	 */
	public int getTotalItems() {
		return beverages.size();
	}
	
	/** Mutators */
	/**
	 * @param orderNum
	 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	/**
	 * @param orderTime
	 */
	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * @param orderDay
	 */
	public void setOrderDay(DAY orderDay) {
		this.orderDay = orderDay;
	}
	/**
	 * @param c
	 */
	public void setCustomer(Customer c) {
		customer = c;
	}
}