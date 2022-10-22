package com.GuessNum;
import java.util.Scanner;
public class GuessingGame {
	public static void main(String arg[])

	{
	guessingNumberGame();
	}
	public static void guessingNumberGame()
	{
	Scanner sc = new Scanner(System.in);   
	int secretnumber = 1 + (int)(100 * Math.random());
	int total_attempts = 5;
	int i, guessedNumber;
	System.out.println("***WELCOME TO NUMBER GUESSING GAME***");
	System.out.println("--------------------------------------");
	System.out.println("A number is chosen" + " between 1 to 100."); 
	System.out.println("Guess the number"   + " within 5 trials.");
	System.out.println("---------------------------------------");
	for (i = 0; i < total_attempts; i++) 
	{
	System.out.println("Guess the number:");
	guessedNumber = sc.nextInt();
	if (secretnumber == guessedNumber) {
	System.out.println("Congratulations!" + " You guessed the number.");
	break;
	}
	else if (secretnumber > guessedNumber && i != total_attempts - 1) {
	System.out.println("The number is " + "greater than " + guessedNumber);
	}
	 else if (secretnumber < guessedNumber && i != total_attempts - 1) {
	 System.out.println( "The number is" + " less than " + guessedNumber);
	}
	} 
	if(i == total_attempts)
	{
	    System.out.println("You have exhausted the total attempts" + "5 attempts.");
	    System.out.println("The number was" + secretnumber);
	}
	}
	}
		