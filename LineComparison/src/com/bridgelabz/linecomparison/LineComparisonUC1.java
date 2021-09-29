package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class LineComparisonUC1 {

	public LineComparisonUC1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		float x1, y1, x2, y2;
		Scanner scan = new Scanner(System.in);

		// Point 1
		System.out.print("Enter the x co-ordinate of Point 1:");
		x1 = scan.nextFloat();
		System.out.print("Enter the y co-ordinate of Point 1:");
		y1 = scan.nextFloat();

		// Point 2
		System.out.print("Enter the x co-ordinate of Point 2:");
		x2 = scan.nextFloat();
		System.out.print("Enter the y co-ordinate of Point 2:");
		y2 = scan.nextFloat();

		scan.close();

		double length = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		System.out.println("Length of line (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is: " + length);

	}

}
