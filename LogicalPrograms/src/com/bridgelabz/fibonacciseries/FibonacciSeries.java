package com.bridgelabz.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {

	public FibonacciSeries() {

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the value for n:");
		long n = scan.nextInt();

		scan.close();

		long a = 0, b = 1;
		System.out.print(a + " " + b + " ");

		for (long i = 0; i < n - 2; i++) {
			System.out.print(a + b + " ");
			long tmp = a;
			a = b;
			b = tmp + b;
		}

	}

}
