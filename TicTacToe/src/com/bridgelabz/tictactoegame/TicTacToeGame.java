package com.bridgelabz.tictactoegame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

	static final String X = "X";
	static final String O = "O";
	static Character[][] board = new Character[3][3];

	public TicTacToeGame() {
		System.out.println("Game Begins");
	}

	public static void main(String[] args) {

		initializeBoard();
		System.out.println("Game starts:");
		showBoard();

		Character player, computer;

		String input = getUserInput();

		System.out.println(input);

		if (input.equalsIgnoreCase(X)) {
			player = X.charAt(0);
			computer = O.charAt(0);
		} else {
			player = O.charAt(0);
			computer = X.charAt(0);
		}

		System.out.println("Player chose: " + player);
		System.out.println("Computer is assigned: " + computer);

		showBoard();

		for (int i = 0; i < 10; i++) {
			// Player 1 turn
			System.out.println("Player 1 turn.");
			int cellNumber = getCellNumberFromPlayer();
			placePosition(player, cellNumber);

			showBoard();

			// Computer turn
			System.out.println("Computer turn.");
			cellNumber = getCellNumberForComputer();
			placePosition(computer, cellNumber);

			showBoard();
		}

	}

	private static int getCellNumberForComputer() {
		Random random = new Random();
		int max = 9;
		int min = 1;
		int cell = 0;
		Character ch;
		do {
			cell = random.nextInt(max - min + 1) + min;

			ch = getCharacterPosition(cell);

		} while (!(ch == ' '));

		System.out.println("Computer chose cell: " + cell);
		return cell;

	}

	private static void placePosition(Character character, int cellNumber) {
		switch (cellNumber) {
		case 1:
			board[0][0] = character;
			break;
		case 2:
			board[0][1] = character;
			break;
		case 3:
			board[0][2] = character;
			break;
		case 4:
			board[1][0] = character;
			break;
		case 5:
			board[1][1] = character;
			break;
		case 6:
			board[1][2] = character;
			break;
		case 7:
			board[2][0] = character;
			break;
		case 8:
			board[2][1] = character;
			break;
		case 9:
			board[2][2] = character;
			break;
		default:
			break;

		}
	}

	private static void showBoard() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
	}

	private static void initializeBoard() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static String getUserInput() {
		Scanner scan = new Scanner(System.in);

		String userInput = "";
		do {
			System.out.println("Enter either X or O:");
			userInput = scan.next();
		} while (!userInput.equalsIgnoreCase(O) && !userInput.equalsIgnoreCase(X));

		return userInput;

	}

	private static int getCellNumberFromPlayer() {
		Scanner scan = new Scanner(System.in);
		int cellNumber = 0;
		Character ch;
		do {
			System.out.println("Please choose an empty position from  [1 to 9]:");

			cellNumber = scan.nextInt();

			ch = getCharacterPosition(cellNumber);

		} while (!(cellNumber >= 1 && cellNumber <= 9 && (ch == ' ')));
		return cellNumber;

	}

	private static Character getCharacterPosition(int cellNumber) {
		Character ch;
		switch (cellNumber) {
		case 1:
			ch = board[0][0];
			break;
		case 2:
			ch = board[0][1];
			break;
		case 3:
			ch = board[0][2];
			break;
		case 4:
			ch = board[1][0];
			break;
		case 5:
			ch = board[1][1];
			break;
		case 6:
			ch = board[1][2];
			break;
		case 7:
			ch = board[2][0];
			break;
		case 8:
			ch = board[2][1];
			break;
		case 9:
			ch = board[2][2];
			break;
		default:
			ch = 'X';
			break;

		}
		return ch;
	}

}
