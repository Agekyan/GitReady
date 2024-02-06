package srrc;
//David Agekyan 

import java.util.Scanner;
public class GitReady{
	public static void main (String[] args){
		// Created scanner object
		Scanner scan = new Scanner(System.in);
		// Asks for user inputs
		// Prompting Player 1 to choose rock, scissors, or paper
		System.out.println("Player 1: Choose rock, scissors, or paper: ");
		String player1 = scan.nextLine();

		// Prompting Player 2 to choose rock, scissors, or paper
		System.out.println("Player 2: Choose rock, scissors, or paper: ");
		String player2 = scan.nextLine();

		// Checking if player1's choice is valid
		boolean correct1 = ("rock".equalsIgnoreCase(player1)) || (("scissors".equalsIgnoreCase(player1)) ||
		        (("paper".equalsIgnoreCase(player1))));

		// Checking if player2's choice is valid
		boolean correct2 = ("rock".equalsIgnoreCase(player2)) || (("scissors".equalsIgnoreCase(player2)) ||
		        (("paper".equalsIgnoreCase(player2))));

		// Closing scanner after input
		scan.close();

		// Checking if either player's choice was invalid
		if (!(correct1 && correct2)) {
		    System.out.println("Wrong choice!");
		} else if (player1.equalsIgnoreCase(player2)) { // Checking for a tie
		    System.out.println("It is a tie.");
		} else if ("rock".equalsIgnoreCase(player1) && "scissors".equalsIgnoreCase(player2)) { // Player 1 chooses rock and player 2 chooses scissors
		    System.out.println("Player 1 wins.");
		} else if ("rock".equalsIgnoreCase(player2) && "scissors".equalsIgnoreCase(player1)) { // Player 2 chooses rock and player 1 chooses scissors
		    System.out.println("Player 2 wins.");
		} else if ("rock".equalsIgnoreCase(player1) && "paper".equalsIgnoreCase(player2)) { // Player 1 chooses rock and player 2 chooses paper
		    System.out.println("Player 2 wins.");
		} else if ("rock".equalsIgnoreCase(player1) && "paper".equalsIgnoreCase(player2)) { // Player 1 chooses rock and player 2 chooses paper
		    System.out.println("Player 1 wins.");
		} else if ("paper".equalsIgnoreCase(player1) && "scissors".equalsIgnoreCase(player2)) { // Player 1 chooses paper and player 2 chooses scissors
		    System.out.println("Player 2 wins.");
		} else { // In all other cases, player 1 wins
		    System.out.println("Player 1 wins.");
		}

	}
}