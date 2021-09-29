package com.bridgelabz.reverseanumber;

import java.util.Scanner;

public class ReverseANumber {

	public ReverseANumber() {

	}

	public static void main(String[] args) {

		System.out.println("Enter the number:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		int reverse = 0;
		while (number != 0) {

			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.println("Reversed number:" + reverse);
	}

}
