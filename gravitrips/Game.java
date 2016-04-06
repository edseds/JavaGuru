package gravitrips;

public class Game {

	static private final int RESULT_TO_WIN = 3;

	Board board = new Board();

	public void runGame(Player playerO, Player playerX) {
		Player currentPlayer = null;

		playerO.setToken(Token.O);
		playerX.setToken(Token.X);

		System.out.println("Start the Gravitrips!");

		do {
			if (currentPlayer == null)
				if (Token.getRandom() == Token.O)
					currentPlayer = playerO;
				else
					currentPlayer = playerX;
			else if (currentPlayer == playerX)
				currentPlayer = playerO;
			else
				currentPlayer = playerX;

			currentPlayer.setMove(board);

		} while (!hasWinner(currentPlayer.getPlayerToken()));
		printWinner(currentPlayer.getPlayerToken());

	}

	private void printWinner(Token symbol) {
		System.out.println("");
		System.out.println("------------------------------------");
		System.out.println("Player: " + symbol + " win the game.");
		board.printBoard();
	}

	private boolean hasWinner(Token symbol) {
		return checkHorizontol(symbol) || checkColumn(symbol) || checkDiagonal(symbol);
	}

	private boolean checkHorizontol(Token symbol) {
		int count = 0;

		for (int x = 0; x < board.getRows(); x++) {
			for (int i = 0; i < board.getColumns(); i++) {
				if (board.getCell(i, x) == symbol)
					count++;
				else
					count = 0;

				if (count == RESULT_TO_WIN) {
					return true;
				}
			}

		}
		return false;
	}

	private boolean checkColumn(Token symbol) {
		int count = 0;
		for (int x = 0; x < board.getColumns(); x++) {
			for (int i = 0; i < board.getRows(); i++) {

				if (board.getCell(x, i) == symbol)
					count++;
				else
					count = 0;

				if (count == RESULT_TO_WIN) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean checkDiagonal(Token symbol) {
		int count = 0;

		for (int k = 0; k < board.getRows() * 2; k++) {
			for (int j = 0; j <= k; j++) {
				int i = k - j;
				if (i < board.getColumns() && j < board.getRows() && board.getCell(i, j) == symbol)
					count++;
				else
					count = 0;

				if (count == RESULT_TO_WIN)
					return true;
			}
		}
		return false;
	}

	/*
	 * private boolean checkLeftDiagonal(Token symbol) {
	 * 
	 * for (int k = RESULT_TO_WIN; k < board.getColumns(); k++) { int count = 0;
	 * 
	 * for (int j = 0; j < k; j++) { int i = k - j;
	 * 
	 * // System.out.print(board.getCell(i, j) + " ");
	 * 
	 * if (board.getCell(i, j) == symbol) count++; else count = 0;
	 * 
	 * if (count == RESULT_TO_WIN) { return true; } } } return false;
	 * 
	 * }
	 * 
	 * private boolean checkRightDiagnol(Token symbol) {
	 * 
	 * int count = 0;
	 * 
	 * for (int k = board.getColumns() - 2; k >= 0; k--) { for (int j = 0; j <=
	 * k; j++) { int i = k - j;
	 * System.out.print(board.getCell(board.getColumns() - i - 1,
	 * board.getRows() - j - 1) + " ");
	 * 
	 * // if (board.getCell(board.getColumns() - i - 1, board.getRows() // - j -
	 * 1) == symbol) // count++; // else // count = 0;
	 * 
	 * // if (count == RESULT_TO_WIN) { // return true; // } } } return false;
	 * 
	 * }
	 */
}
