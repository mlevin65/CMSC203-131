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
public class ManagementCompany {
/**
 * String variables
 */
private String name, taxId;
/**
 * double variable
 */
private double managementFee;
/**
 * Constant variables
 */
private final int MAX_PROPERTY = 5, MGMT_WIDTH = 10, MGMT_DEPTH = 10;
/**
 * 
 */
private Plot plot;
/**
 * Integer variable responsible for storing the amount of propertys
 */
private int propertyCount = 0;
/**
 * 
 */
private Property[] properties;


private String propertyName, city, owner;
private double rentAmount;

//constructors
/*1st*/
/**
 * 
 */
public ManagementCompany() {
	this.name = null;
	this.taxId = null;
	this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	properties = new Property[MAX_PROPERTY];
}
/*2nd*/
/**
 * @param name
 * @param taxId
 * @param managementFee
 */
public ManagementCompany(String name, String taxId, double managementFee) {
	this.name = name;
	this.taxId = taxId;
	this.managementFee = managementFee;
	plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	properties = new Property[MAX_PROPERTY];
}
/*3rd*/
/**
 * @param name
 * @param taxId
 * @param managementFee
 * @param x
 * @param y
 * @param width
 * @param depth
 */
public ManagementCompany(String name, String taxId, double managementFee, int x, int y, int width, int depth) {
	this.name = name;
	this.taxId = taxId;
	this.managementFee = managementFee;
	plot = new Plot(x, y, width, depth);
	properties = new Property[MAX_PROPERTY];
}
/*4th*/
/**
 * @param otherCompany
 */
public ManagementCompany(ManagementCompany otherCompany) {
	name = otherCompany.name;
	taxId = otherCompany.taxId;
	managementFee = otherCompany.managementFee;
	plot = new Plot (otherCompany.plot);
	properties = new Property[MAX_PROPERTY];
}

//methods

/**
 * @param property
 * @return
 */
public int addProperty(Property property) {
		
	Property propertyCopy = new Property(property);
	
	//System.out.println(propertyCount);
	if(propertyCount == MAX_PROPERTY) {// if the number of properties is equal to the max then -1
		return -1;
	}
	
	else if(propertyCopy == null) { //return -2 if property is null
		
		return -2;
	}
	
	else if(plot.encompasses(propertyCopy.getPlot()) == false) {//return -3 if the plot is not contained by the MgmtCo plot
	
		return -3;
	}
	
	for(int index = 0; index < propertyCount; index++) { // checking to see if it overlaps
		if (properties[index].getPlot().overlaps(property.getPlot())) {
			return -4;
		}
	}
		


		properties[propertyCount] = propertyCopy;
		propertyCount++; //iterate
		//System.out.println(propertyCount);
		
		/* The main issue was that I was returning the amount of properties instead of returning the index of the number of properties. */
		
		int index = 0;
		for(int i = 0; i < properties.length; i++) { // searches the array for the index
			if(properties[i] == propertyCopy) {
				index = i;
			}
		}
		return index;	
	
		
}

/**
 * @param name
 * @param city
 * @param rent
 * @param owner
 * @return
 */
public int addProperty(String name, String city, double rent, String owner) {
	Property propertyCopy = new Property(name, city, rent, owner, 0, 0, 1, 1);// create new property object

	
	if(propertyCount == MAX_PROPERTY) { // if the number of properties is equal to the max then return -1

		return -1;
	}
	
	else if(propertyCopy == null) { //return -2 if property is null
		
		return -2;
	}
	
	else if(plot.encompasses(propertyCopy.getPlot()) == false) {//return -3 if the plot is not contained by the MgmtCo plot
		
		return -3;
	}
	for(int i = 0; i < propertyCount; i++) {// for loop that checks to see if it overlaps
		if(properties[i].getPlot().overlaps(propertyCopy.getPlot())) {//if so, return -4
			
			return -4;
		}
	}


	System.out.println(propertyCount);
	properties[propertyCount] = propertyCopy;
	propertyCount++; //iterate
	
	int index = 0;
	for(int i = 0; i < properties.length; i++) {
		if(properties[i] == propertyCopy) {
			index = i;
		}
	}
	return index;	
}
	

/**
 * @param name
 * @param city
 * @param rent
 * @param owner
 * @param x
 * @param y
 * @param width
 * @param depth
 * @return
 */
public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
	Property propertyCopy = new Property(name, city, rent, owner, 0, 0, 1, 1);// create new property object
	
	

	propertyCount++;
	
	if(propertyCount == MAX_PROPERTY) { // if the number of properties is equal to the max then return -1
	
		return -1;
	}
	
	else if(propertyCopy == null) { //return -2 if property is null
		
		return -2;
	}
	
	else if(plot.encompasses(propertyCopy.getPlot()) == false) {//return -3 if the plot is not contained by the MgmtCo plot
		
		return -3;
	}
	for(int i = 0; i < propertyCount; i++) {// for loop that checks to see if it overlaps
		if(properties[i].getPlot().overlaps(propertyCopy.getPlot())) {//if so, return -4
			
			return -4;
		}
	}

	System.out.println(propertyCount);
	properties[propertyCount] = propertyCopy;
	propertyCount++; //iterate
	
	int index = 0;
	for(int i = 0; i < properties.length; i++) {
		if(properties[i] == propertyCopy) {
			index = i;
		}
	}
	return index;	
		
}

/**
 * 
 * @return
 */
public double totalRent() {
	double tRent = 0.0;
	for(int x = 0; x < propertyCount; x++) {
		tRent = (properties[x].getRentAmount() + tRent);// adds up all of the amounts of rent
	}
	return tRent;
}


/**
 * @return
 */
public int maxRentPropertyIndex() {
	int index = 0;
	for(int i = 0; i < propertyCount; i++) {//for loop to find the index of the property with the max rent amount
		if(properties[index].getRentAmount() < properties[i].getRentAmount()) {
				index = i;
		}
	}


return index;

}


/**
 * @return
 */
public double maxRentProp() {
	double maximumRentAmount = 0;
	maximumRentAmount = properties[maxRentPropertyIndex()].getRentAmount();//maximumRentAmount will equal the property with the maximum rent amount
	return maximumRentAmount;
}


/**
 * @param i
 * @return
 */
public String displayPropertyAtIndex(int i) {
	String text = " ";
	if (properties[i] != null) {
		text = ("Owner: " + properties[i].getOwner() + "City: " + properties[i].getCity() +
				"Property Name: " + properties[i].getPropertyName() + "Rent Amount: " + 
				properties[i].getRentAmount() + "Plot: " + properties[i].getPlot());
	}
	return text;
}

/**
 *
 */
@Override
public String toString() {

	double finalTotalManagementFee = totalRent() * (managementFee / 100);
	String text = " ";
	//console output
	text = "List of the properties for " + name + ", taxID: " + taxId +
			"\n________________________________\n";
	for(int x = 0; x < propertyCount; x++) {
	
		text += ("\nProperty Name: " + properties[x].getPropertyName() + "\n Located in: " + properties[x].getCity() + "\n Belonging to: " +properties[x].getOwner() + "\n Rent Amount: " + properties[x].getRentAmount());
		
		
	}
	text += "\n________________________________\nTotal Management Fee: " + finalTotalManagementFee;
	
	return text;
	
	
}

/*get methods*/
public int getMAX_PROPERTY() {
	return MAX_PROPERTY;
}

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
public String getName() {
	return name;
}


}