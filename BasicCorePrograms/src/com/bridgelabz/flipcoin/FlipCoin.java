package com.bridgelabz.flipcoin;

import java.io.IOException;
import java.util.Scanner;

public class FlipCoin {

	public FlipCoin() {
	}

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of coin flips: ");
		int numberOfCoinFlips = scan.nextInt();
		scan.close();

		System.out.println("Entered value for number of coin flips:" + numberOfCoinFlips);

		int headCounter = 0;

		int tailCounter = 0;

		double random = 0;

		for (int i = 0; i < numberOfCoinFlips; i++) {

			random = Math.random();
			System.out.println(random);

			if (random < 0.5) {
				System.out.println("Tails");

				tailCounter++;
			} else {

				System.out.println("Heads");
				headCounter++;
			}

		}
		System.out.println("headCounter:" + headCounter);
		System.out.println("tailCounter:" + tailCounter);

		float headPercent = ((float) headCounter / numberOfCoinFlips) * 100.0f;
		float tailPercent = ((float) tailCounter / numberOfCoinFlips) * 100.0f;

		System.out.println("headPercent: " + headPercent);
		System.out.println("tailPercent: " + tailPercent);
	}

}
