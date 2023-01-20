import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args){

		String movieTital;
		String movieRating;
		int ticketsSold;
		char ch='y';

		Scanner keyboard = new Scanner(System.in);

		while(ch == 'y'){ //Repetition loop
			Movie m = new Movie();

			System.out.println("Enter the name of the movie ");
			movieTital = keyboard.nextLine();
			m.setTitle(movieTital);//setting title

			System.out.println("Enter the rating of the movie ");
			movieRating = keyboard.nextLine();
			m.setRating(movieRating);//set rating

			System.out.println("Enter the number of tickets sold for this movie ");
			ticketsSold = keyboard.nextInt();
			m.setSoldTickets(ticketsSold);//set # of tickets sold

			System.out.println(m.toString());

			System.out.println("Do you want to enter another? (y or n)");
			ch = keyboard.next().charAt(0);
			keyboard.nextLine();

		}

		System.out.println("Goodbye");


	}

}