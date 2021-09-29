package com.bridgelabz.quotientandremainder;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter dividend:");
		int dividend = scan.nextInt();

		System.out.print("Enter divisor:");
		int divisor = scan.nextInt();
		if (divisor == 0) {
			System.out.println("Divisor cannot be 0");
		}

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient:" + quotient);
		System.out.println("Remainder:" + remainder);
		scan.close();
	}
}
