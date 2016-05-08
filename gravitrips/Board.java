package gravitrips;

public class Board {
	private final int COLUMN = 7;
	private final int ROW = 6;
	private Token[][] field = new Token[ROW][COLUMN];

	public Board() {

		for (int j = 0; j < COLUMN; j++) {
			for (int i = 0; i < ROW; i++) {
				field[i][j] = Token.EMPTY;
			}
		}
	}

	public void printBoard() {

		String tmpValue;

		System.out.println();

		tmpValue = "   ";
		for (int i = 1; i <= COLUMN; i++) {
			tmpValue += i;
			if (i != COLUMN)
				tmpValue += ", ";

		}

		System.out.println(tmpValue);

		for (int i = 0; i < field.length; i++) {
			tmpValue = "";
			for (int j = 0; j < field[i].length; j++) {
				tmpValue += "  " + field[i][j];
			}
			System.out.println((i + 1 + tmpValue).toString());
		}
	}

	public int getColumns() {
		return COLUMN;
	}

	public int getRows() {
		return ROW;
	}

	public Token getCell(int column, int row) {
		return field[row][column];
	}

	public boolean setCellValue(int column, Token playertoken) {
		if (field[0][column] != Token.EMPTY) {
			return false;
		}
		int i = field.length - 1;

		while (field[i][column] != Token.EMPTY) {
			i--;
		}
		field[i][column] = playertoken;

		return true;
	}

}
