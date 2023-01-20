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
public class Customer {
	private String name;
	private int age;
	
	/** 
	 * Constructor
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**
	 * Constructor
	 * @param c
	 */
	public Customer(Customer c) {
		name = c.getName();
		age = c.getAge();
	}
	
	/**
	 * toString method
	 * @return String
	 */
	public String toString() {
		return name +", " + age + "y/o";
	}
	
	/**
	 * @return
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
