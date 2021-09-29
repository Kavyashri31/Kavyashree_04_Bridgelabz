package com.bridgelabz.largestnumber;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number:");
		int number1 = scan.nextInt();

		System.out.print("Enter second number:");
		int number2 = scan.nextInt();

		System.out.print("Enter third number:");
		int number3 = scan.nextInt();

		scan.close();

		int max = number1;

		if (number2 > max)
			max = number2;
		if (number3 > max)
			max = number3;

		System.out.println("Largest among " + number1 + ", " + number2 + ", " + number3 + " is: " + max);

	}
}
