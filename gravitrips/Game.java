package gravitrips;

public class Game {

	static private final int RESULT_TO_WIN = 3;

	Board board = new Board();

	public void runGame(Player playerO, Player playerX) {
		Player currentPlayer = null;

		playerO.setToken(Token.O);
		playerX.setToken(Token.X);

		System.out.println("Start the Gravitrips!");

		currentPlayer = playerX;

		do {
			currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
			currentPlayer.setMove(board);

		} while (!hasWinner(currentPlayer.getPlayerToken()));

		printWinner(currentPlayer.getPlayerToken());

	}

	private void printWinner(Token symbol) {
		System.out.println();
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
}
