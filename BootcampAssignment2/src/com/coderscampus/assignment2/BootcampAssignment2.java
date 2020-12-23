package com.coderscampus.assignment2;

import java.util.Scanner;
import java.util.Random;

public class BootcampAssignment2 {

	public static void main(String[] args) {

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		// creating random number
		int randomNumber = random.nextInt(100) + 1;

		int guesses = 0;

		System.out.println("Welcome, try to guess the number between 1-100.\nYou have 5 tries.\nGood Luck!");

		// checking conditions

		while (guesses < 5) {
			System.out.print("Please guess the random number between 1 and 100: ");
			int guessedNumber = scanner.nextInt();

			if (guessedNumber < 1 || guessedNumber > 100) {

				System.out.println("Please pick a number between 1-100!");
			}

			else if (guessedNumber > randomNumber) {
				System.out.println("Guess lower!");
				guesses++;
			} else if (guessedNumber < randomNumber) {
				System.out.println("Guess higher!");
				guesses++;

			}

			else if (guessedNumber == randomNumber) {
				System.out.println("AMAZING! YOU HAVE WON!");
				break;
			}

		}

		scanner.close();
		if (guesses >= 5) {
			System.out.println("You Lost! The number to guess was: " + randomNumber);

		}
	}

}
