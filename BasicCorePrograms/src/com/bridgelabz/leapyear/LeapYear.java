package com.bridgelabz.leapyear;

import java.util.Scanner;

public class LeapYear {

	public LeapYear() {
	}

	public static void main(String[] args) {

		System.out.println("Leap Year Program");
		Scanner scan = new Scanner(System.in);

		Integer year;
		do {
			System.out.print("Enter 4 digits for year: ");
			year = scan.nextInt();

		} while (year.toString().length() != 4);

		scan.close();

		System.out.println("Entered year:" + year);

		if ((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("It's a leap year.");
		}

		else {
			System.out.println("It's not a leap year.");
		}

	}

}
