package gravitrips;

public class Game {

	static final int RESULT_TO_WIN = 3;
	Player currentPlayer = null;

	public void runGame() {
		Board board = new Board();
		boolean isWinner = false;

		Player playerO = new Player(Token.O);
		Player playerX = new Player(Token.X);

		if (Token.getRandom() == Token.O)
			currentPlayer = playerO;
		else
			currentPlayer = playerX;

		System.out.println("Start the Gravitrips!");

		do {
			currentPlayer.setMove(board);
			isWinner = hasWinner(board);
			board.printBoard();

			if (!isWinner) {
				if (currentPlayer == playerX)
					currentPlayer = playerO;
				else
					currentPlayer = playerX;
			}

		} while (!isWinner);

		printWinner(board);

	}

	private void printWinner(Board board) {
		System.out.println("Player: " + currentPlayer.getPlayerToken().toString() + " win the game.");
	}

	private boolean hasWinner(Board board) {
		return checkHorizontol(board, currentPlayer) || checkColumn(board, currentPlayer)
				|| checkDiagonal(board, currentPlayer);
	}

	private boolean checkHorizontol(Board board, Player player) {
		int count = 0;

		for (int x = 0; x < board.getRows(); x++) {
			for (int i = 0; i < board.getColumns(); i++) {
				if (board.getCell(i, x) == player.getPlayerToken())
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

	private boolean checkColumn(Board board, Player player) {
		int count = 0;
		for (int x = 0; x < board.getColumns(); x++) {
			for (int i = 0; i < board.getRows(); i++) {

				if (board.getCell(x, i) == player.getPlayerToken())
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

	private boolean checkDiagonal(Board board, Player player) {
		return checkLeftDiagonal(board, player) || checkRightDiagnol(board, player);
	}

	private boolean checkLeftDiagonal(Board board, Player player) {
		for (int x = RESULT_TO_WIN - 1; x < board.getColumns(); x++) {
			if (findSymbolsLeftDiagonal(x, 0, player, board))
				return true;
		}

		for (int x = 1; x < board.getRows() - (RESULT_TO_WIN - 1); x++) {
			if (findSymbolsLeftDiagonal(board.getColumns(), x, player, board))
				return true;
		}

		return false;
	}

	private boolean findSymbolsLeftDiagonal(int x, int y, Player player, Board board) {
		return false;
	}

	private boolean checkRightDiagnol(Board board, Player player) {
		return false;
	}

}
