package gravitrips;

import java.util.Scanner;

public class HumanPlayer extends Player {

	private Scanner scanner = new Scanner(System.in);

	@Override
	public void setMove(Board board) {

		int move = 0;
		boolean setValidMove = false;
		board.printBoard();

		do {
			try {
				System.out.print("Player " + getPlayerToken() + " make move:");

				move = Integer.parseInt(scanner.nextLine());

				if (move >= 0 && move < board.getColumns()) {
					if (board.getCell(move, 0) == Token.EMPTY) {
						board.setCellValue(move, getPlayerToken());
						setValidMove = true;
					} else {
						System.out.println("The column must be empty. Try again please!");
					}

				} else {
					System.out.println("Please set valid move. Try again please! Valid number range (0-6).");
				}
			} catch (Exception ex) {
				System.out.println("Something goes wrong! Try again please! Valid number range (0-6).");
			}

		} while (!setValidMove);
	}
}
