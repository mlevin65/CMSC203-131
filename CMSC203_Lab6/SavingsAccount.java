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

public class SavingsAccount extends BankAccount {
	//initialize variables
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	/*
	 * First constructor
	 * 
	 * @param name
	 * @param initialBalance
	 * Takes a name and an initial balance as parameters and calls 
	 * the constructor for the superclass.
	 * */
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	/*
	 * Constructor 2 (copy constructor)
	 * @param originalAccount
	 * @param initialBalance
	 * 
	 * */
	
	public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
		super(originalAccount, initialBalance); //calls the copy constructor of the superclass
		savingsNumber = originalAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;//assign the accountNumber to be the accountNumber of the superclass concatenated with the hypen and the savingsNumber of the new account.
	
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void postInterest() {//calculates one month's worth of interest on the balance and deposit it into the account.
		double newBalance;
		rate = (rate/100)/12;
		newBalance = (getBalance() * (1 + rate));
		setBalance(newBalance);
	}

}


