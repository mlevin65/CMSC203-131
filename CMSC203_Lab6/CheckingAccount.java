/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Due: 4/11/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Miles Levine
*/
public class CheckingAccount extends BankAccount {
	private static final double FEE = 0.15; //equal to 15 cents
	
	public CheckingAccount(String name, double initialAmount) {
		super(name, initialAmount);// calls the constructor from superclass
		setAccountNumber(getAccountNumber() + "-10");//All checking accounts at this bank are identified by the extension –10
	}
	public boolean withdraw(double amount) {//takes the amount to withdraw, adds to it the fee for check clearing, and calls the withdraw method from the superclass
		amount += FEE;
		return super.withdraw(amount);
	}

}
