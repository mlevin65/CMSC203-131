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


import java.util.Arrays;

/**
 * @author Miles Levine
 *
 */
public class Property {
//Create instance variables 
/**
 * variables
 */
private String propertyName, city, owner;
private double rentAmount;
private Plot plot;


/**
 * 
 */
public Property() {
	this.propertyName = " ";
	this.city = " ";
	this.owner = " ";
	this.rentAmount = 0.0;
	this.plot = new Plot();
}

//Second constructor
/**
 * @param p
 */
public Property(Property p) {
	this.propertyName = p.propertyName;
	this.city = p.city;
	this.owner = p.owner;
	this.rentAmount = p.rentAmount;
	this.plot = new Plot(p.plot);
}

//Third constructor
/**
 * @param propertyName
 * @param city
 * @param rentAmount
 * @param owner
 */
public Property(String propertyName, String city, double rentAmount, String owner) {
	this.propertyName = propertyName;
	this.city = city;
	this.owner = owner;
	this.rentAmount = rentAmount;
	this.plot = new Plot();
}

//Fourth constructor
/**
 * @param propertyName
 * @param city
 * @param rentAmount
 * @param owner
 * @param x
 * @param y
 * @param width
 * @param depth
 */
public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
	this.propertyName = propertyName;
	this.city = city;
	this.owner = owner;
	this.rentAmount = rentAmount;
	this.plot = new Plot(x, y, width, depth);
}

//get methods

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

//set methods

public void setPropertyName(String propertyName) {
	this.propertyName = propertyName;
}

public void setCity(String city) {
	this.city = city;
}

public void setRentAmount(double rentAmount) {
	this.rentAmount = rentAmount;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public Plot setPlot(int x, int y, int width, int depth) {
	return new Plot(x, y, width, depth);
}

//toString method

/**
 *
 */
public String toString() {
	String str = "Property Name: " + propertyName + "\nLocation: " + city + "\nBelonging to: " + owner + "\nRent Amount: " + rentAmount;
return str;
}

}
