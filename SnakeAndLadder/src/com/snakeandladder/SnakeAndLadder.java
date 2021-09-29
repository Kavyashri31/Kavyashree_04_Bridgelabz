package com.snakeandladder;

public class SnakeAndLadder {

	public SnakeAndLadder() {

	}

	public static void main(String[] args) {

		int player1 = 0;

		final String NO_PLAY = "NO PLAY";
		final String SNAKE = "SNAKE";
		final String LADDER = "LADDER";
		final int HUNDRED = 100;
		String option;

		while (true) {
			int die = getRandomWithinRange(1, 7);
			System.out.println("die" + die);

			int optionInt = getRandomWithinRange(1, 4);
			System.out.println("OptionInt:" + optionInt);

			option = getOption(NO_PLAY, SNAKE, LADDER, optionInt);

			System.out.println("Option:" + option);

			if (option.equals(NO_PLAY)) {
				System.out.println(NO_PLAY + " | Player remains in the same position:" + player1);
			} else if (option.equals(LADDER)) {
				player1 = player1 + die;
				System.out.println(LADDER + " | Player moves UP to position:" + player1);
			} else if (option.equals(SNAKE)) {
				player1 = player1 - die;
				System.out.println(SNAKE + " | Player moves BACK to position:" + player1);
			}

			if (player1 == HUNDRED) {
				System.out.println("Player 1 reached the finish position 100! Player 1 won the game!!!");
				break;
			} else if (player1 < 0)
				player1 = 0;
			else if (player1 > HUNDRED)
				player1 = player1 - die;
		}
	}

	private static String getOption(final String NO_PLAY, final String SNAKE, final String LADDER, int optionInt) {
		String option;
		if (optionInt == 1)
			option = NO_PLAY;
		else if (optionInt == 2)
			option = SNAKE;
		else
			option = LADDER;
		return option;
	}

	private static int getRandomWithinRange(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

}
