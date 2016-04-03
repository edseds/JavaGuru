package gravitrips;

import gravitrips.Token;
import java.util.Scanner;

public class Player {

	private Token playertoken;
	private Scanner scanner = new Scanner(System.in);

	public Player(Token token) {
		this.playertoken = token;
	}

	public Token getPlayerToken() {
		return playertoken;
	}

	public void setMove(Board board) {
		int move = 0;
		boolean setValidMove = false;
		board.printBoard();

		do {
			System.out.print("Player " + playertoken + " make move:");
			move = Integer.parseInt(scanner.nextLine());

			if (move >= 0 && move < board.getColumns()) {
				if (board.getCell(move, 0) == Token.EMPTY) {
					board.setCellValue(move, playertoken);
					setValidMove = true;
				} else {
					System.out.print("The column must be empty. Try again please!");
				}

			} else {
				System.out.println("Please set valid move. Try again please!");
			}

		} while (!setValidMove);
	}

}
