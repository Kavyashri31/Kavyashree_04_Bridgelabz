package com.bridgelabz.vowel;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter character:");
		char character = scan.next().charAt(0);
		System.out.println("char:" + character);
		if (Character.toLowerCase(character) == 'a' || Character.toLowerCase(character) == 'e'
				|| Character.toLowerCase(character) == 'i' || Character.toLowerCase(character) == 'o'
				|| Character.toLowerCase(character) == 'u') {
			System.out.println(character + " is a vowel.");

		} else
			System.out.println(character + " is a consonant.");

		scan.close();
	}
}
