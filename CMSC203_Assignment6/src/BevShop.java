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
import java.util.Collections;

/**
 * @author Miles
 *
 */
public class BevShop implements BevShopInterface{
	
	private int numOfAlcohol = 0;
	private int currentOrderIdx;
	private ArrayList<Order> orders;
	
	/**
	 * Constructor
	 */
	public BevShop() {
		orders = new ArrayList<>();
	}
	
	/**
	 * validTime method
	 * @param time
	 * @return boolean
	 */
	public boolean validTime(int time) {
		boolean bool = false;
		if (time >= MIN_TIME && time <= MAX_TIME) {
			bool = true;
			return bool;
		}
		else {
			bool = false;
			return bool;
		}
		
	}
	/**
	 * eligibleForMore method
	 * @return boolean
	 */
	public boolean eligibleForMore() {
		boolean bool = false;
		if (numOfAlcohol < 3) {
			bool = true;
			return bool;
		}
		return bool;
	}
	/**
	 * validAge method
	 * @param age
	 * @return boolean
	 */
	public boolean validAge(int age) {
		if (age > MIN_AGE_FOR_ALCOHOL) {
			return true;
		}
		return false;
	}
	
	/**
	 * startNewOrder method
	 * @param time
	 * @param day
	 * @param customerName
	 * @param customerAge
	 */
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		Customer customer = new Customer(customerName, customerAge);
		Order order = new Order(time, day, customer);
		orders.add(order);
		currentOrderIdx = orders.indexOf(order);
		numOfAlcohol = 0;
	}
	/**
	 * processCoffeeOrder method
	 * @param name
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public void processCoffeeOrder(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
		orders.get(currentOrderIdx).addNewBeverage(name, size, extraShot, extraSyrup);
	}
	/**
	 * processSmoothieOrder method
	 * @param name
	 * @param size
	 * @param numOfFruits
	 * @param proteinPowder
	 */
	public void processSmoothieOrder(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
		orders.get(currentOrderIdx).addNewBeverage(name, size, numOfFruits, proteinPowder);
	}
	/**
	 * processAlcoholOrder method
	 * @param name
	 * @param size
	 */
	public void processAlcoholOrder(String name, SIZE size) {
		orders.get(currentOrderIdx).addNewBeverage(name, size);
		numOfAlcohol++;
	}
	
	/**
	 * findOrder method
	 * @paramorderNo
	 * @return integer
	 */
	public int findOrder(int orderNo) {
		int num = 0;
		for(Order o : orders) 
			if(o.getOrderNo() == orderNo) {
				num = orders.indexOf(o);
				break;
			} 
			else {
				num = -1; // not found
			}
		
		return num;
	}
	/**
	 * totalOrderPrice method
	 * @param order
	 * @return double
	 */
	public double totalOrderPrice(int orderNum) {
		
		return orders.get(findOrder(orderNum)).calcOrderTotal();
	}
	/**
	 * totalMonthlySale method
	 * @return double
	 */
	public double totalMonthlySale() {
		double total = 0;
		
		for (Order ord : orders) {
			for (Beverage bev : ord.getBeverages()) {
				total += bev.calcPrice();
			}
		}
		
		return total;
	}
	/**
	 * totalNumOfMonthlyOrders method
	 * @return integer
	 */
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}
	/**
	 * sortOrders method
	 */
	public void sortOrders() {
		Collections.sort(orders);
	}
	/**
	 * getOrderAtIndex method
	 * @param index
	 */
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		String str = "Monthly Orders\n";
		
		for (Order ord : orders) {
			str += ord.toString();
		}
		str += "Total Sale: " + totalMonthlySale();
		
		return str;
	}
	
	
	/**
	 * @return
	 */
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
	}
	/**
	 * @return
	 */
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
	}	
	/**
	 * @return
	 */
	public Order getCurrentOrder() {
		return orders.get(orders.size()-1);
	}
	/**
	 * @param num
	 * @return
	 */
	public boolean isMaxFruit(int num) {
		if (num > MAX_FRUIT) {
			return true;
		}
		return false;
	}
	/**
	 * @return
	 */
	public int getNumOfAlcoholDrink() {
		return numOfAlcohol;
	}


}