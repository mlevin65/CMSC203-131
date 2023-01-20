/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description:Build an application that will receive a guess and report
 * if your guess is the random number that was generated.
 * Due: 2/28/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Miles Levine
*/

import java.util.Scanner;

public class RandomNumberGuesser {

    public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in); //create scanner object
    RNG rand = new RNG();
       
    	int randNum; //declare variables
        int nextGuess;
        int highGuess;
        int lowGuess;
        final String PROGRAMMER_NAME = "Miles Levine";
        String yesNo = "yes";
       
       
        while (yesNo.equals("yes")) { //loop that repeats the guessing game if the user enter's yes at the end of program
        //initialize the variables
        highGuess = 100;
        lowGuess = 1;
        randNum = rand.rand(); //generates random number
        rand.resetCount(); //resets the count
       
            
        System.out.println("Enter your first guess");
        nextGuess = keyboard.nextInt();
           
        while(nextGuess != randNum) { //loop that continues the guessing game until the user guesses correctly
        	if (!rand.inputValidation(nextGuess, lowGuess, highGuess)){
        		nextGuess = keyboard.nextInt();
                continue;
        	}

                System.out.println("Number of guesses is " + rand.getCount()); //display the guess counter
                if (nextGuess > randNum) { //if the guess was higher than the random number then the highGuess variable = the guess
                    highGuess = nextGuess;
                    System.out.println("Your guess is too high");//display too high
                   
                } else {//if the guess was lower than the random number then the lowGuess variable = the guess
                    lowGuess = nextGuess;
                    System.out.println("Your guess is too low");//display too low
                }
                System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess); //displays the range that the user's next should be
                nextGuess = keyboard.nextInt();
            }
            System.out.println("Number of guesses is " + (rand.getCount() + 1)); //when the user guesses correct, the getCount method is added by 1 to display the total amount of guess. 
            System.out.println("Congratulations, you guessed correctly");
           
           
           
            System.out.println("Try again? (yes or no)"); //asks the user if they want to play again
            yesNo = keyboard.next(); //if the user enters "no" the the loop will stop
            System.out.println("");
        }
        System.out.println("Thanks for playing..."); // closing statement
        System.out.println("Programmer: " + PROGRAMMER_NAME);
    }
    


}
