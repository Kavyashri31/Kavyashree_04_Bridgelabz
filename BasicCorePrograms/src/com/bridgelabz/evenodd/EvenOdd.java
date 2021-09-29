package com.bridgelabz.evenodd;

import java.util.Scanner;

public class EvenOdd {

	public EvenOdd() {
	}

	public static void main(String[] args) {
		System.out.print("Enter number:");
		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		scan.close();
		isEven(number);
	}

	private static void isEven(int number) {
		if (number % 2 == 0)
			System.out.println(number + " is even");
		else
			System.out.println(number + " is odd");
	}

}
