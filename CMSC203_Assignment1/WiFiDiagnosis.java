/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description: Wifi Diagnosis problem solver/ trobleshooter
 * Due: 2/14/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Miles Levine
*/

import java.util.Scanner; //Needed for scanner class

public class WiFiDiagnosis {
	public static void main(String[] args) {
	
	String step1Input, step2Input, step3Input, step4Input; //Declare variables
	
	//Create a Scanner object to read input.
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
	
	System.out.println("First step: reboot your computer"); //First step
	System.out.println("Are you able to connect with the internet (yes or no)");
	
	step1Input = keyboard.nextLine(); //collect user's answer
	
	if (step1Input.equalsIgnoreCase("yes")) {//if user enters yes, then program will end 
		System.out.println("Rebooting the computer seemed to work");
		System.exit(0);
	}
	System.out.println("Second step: reboot your router"); //2nd step
	System.out.println("Now are you able to connect with the internet (yes or no)");
	
	step2Input = keyboard.nextLine(); //collect user's answer
	
	if (step2Input.equalsIgnoreCase("yes")) {//if user enters yes, then program will end 
		System.out.println("Rebooting the router seemed to work");
		System.exit(0);
	}
	System.out.println("Third step: make sure the cables to your router are plugged in firmly"
			+ " and your router is getting power"); //3rd step
	System.out.println("Now are you able to connect with the internet (yes or no)");
	
	step3Input = keyboard.nextLine(); //collect user's answer
	
	if (step3Input.equalsIgnoreCase("yes")) { //if user enters yes, then program will end 
		System.out.println("Checking the router's cables seemed to work");
		System.exit(0);
	}
	System.out.println("Fouth step: move your computer closer to your router."); //4th step
	System.out.println("Now are you able to connect with the internet (yes or no)");
	
	step4Input = keyboard.nextLine(); //collect user's answer
	
	if (step4Input.equalsIgnoreCase("yes")) {//if user enters yes, then program will end 
		System.out.println("Moving the computer closer to the router seemed to work");
		System.exit(0);
	}
	System.out.println("Fith step: contact your ISP"); //5th step
	System.out.println("Make sure your ISP is hooked up to your router.");
	
	System.exit(0);
}
}
