package srrc;
//David Agekyan 

import java.util.Scanner;
public class GitReady{
	public static void main (String[] args){
		// Created scanner object
		Scanner scan = new Scanner(System.in);
		// Asks for user inputs
		System.out.println("Player 1: Choose rock, scissors, or paper: ");
		String player1 = scan.nextLine();
		System.out.println("Player 2: Choose rock, scissors, or paper: ");
		String player2 = scan.nextLine();
		boolean correct1 =("rock".equalsIgnoreCase(player1))||(("scissors".equalsIgnoreCase(player1))||
				(("paper".equalsIgnoreCase(player1))));
		boolean correct2 =("rock".equalsIgnoreCase(player2))||(("scissors".equalsIgnoreCase(player2))||
				(("paper".equalsIgnoreCase(player2))));
		scan.close();
		if(!(correct1&&correct2))
		{
			System.out.println("Wrong choice!");
		}
		else if (player1.equalsIgnoreCase(player2))
		{
			System.out.println("It is a tie.");
		}
		else if ("rock".equalsIgnoreCase(player1)&&"scissors".equalsIgnoreCase(player2))
		{
			System.out.println("Player 1 wins.");
		}
		else if ("rock".equalsIgnoreCase(player2)&&"scissors".equalsIgnoreCase(player1))
		{
			System.out.println("Player 2 wins.");
		}
		else if ("rock".equalsIgnoreCase(player1)&&"paper".equalsIgnoreCase(player2))
		{
			System.out.println("Player 2 wins.");
		}
		else if ("rock".equalsIgnoreCase(player1)&&"paper".equalsIgnoreCase(player2))
		{
			System.out.println("Player 1 wins.");
		}
		else if ("paper".equalsIgnoreCase(player1)&&"scissors".equalsIgnoreCase(player2))
		{
			System.out.println("Player 2 wins.");
		}
		else
		{
			System.out.println("Player 1 wins.");
		}
	}
}