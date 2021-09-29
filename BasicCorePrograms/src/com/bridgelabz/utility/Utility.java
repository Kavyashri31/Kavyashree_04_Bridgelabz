package com.bridgelabz.utility;

import java.util.Scanner;

public class Utility {

	Scanner scanner;

	public Utility() {

		scanner = new Scanner(System.in);

	}

	public int getIntValue() {
		return scanner.nextInt();

	}

	public void getHarmonicNumber(int number) {
		double harmonicNumber = 0;
		for (double i = 1; i <= number; i++)

		{
			harmonicNumber = harmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + " is: " + harmonicNumber);
	}
}
