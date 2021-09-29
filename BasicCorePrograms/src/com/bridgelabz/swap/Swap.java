package com.bridgelabz.swap;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first number:");
		int number1 = scan.nextInt();

		System.out.print("Enter second number:");
		int number2 = scan.nextInt();

		int temp = number1;

		number1 = number2;
		number2 = temp;

		System.out.println("Number 1:" + number1);

		System.out.println("Number 2:" + number2);
		scan.close();
	}

}
