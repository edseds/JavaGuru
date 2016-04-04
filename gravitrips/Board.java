package gravitrips;

public class Board {
	private final int column = 7;
	private final int row = 6;
	private Token[][] field = new Token[row][column];

	public Board() {

		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				field[i][j] = Token.EMPTY;
			}
		}
	}

	public void printBoard() {

		String tmpValue;

		System.out.println("");
		// System.out.println(" 1, 2, 3, 4, 5, 6, 7");

		tmpValue = "   ";
		for (int i = 1; i <= column; i++) {
			tmpValue += i;
			if (i != column)
				tmpValue += ", ";

		}

		System.out.println(tmpValue);

		for (int i = 0; i < field.length; i++) {
			tmpValue = "";
			for (int j = 0; j < field[i].length; j++) {
				tmpValue += "  " + field[i][j];
			}
			System.out.println(i + 1 + "" + tmpValue);
		}
	}

	public int getColumns() {
		return field[0].length;
	}

	public int getRows() {
		return field.length;
	}

	public Token getCell(int column, int row) {
		return field[row][column];
	}

	public boolean setCellValue(int column, Token playertoken) {
		if (field[0][column] != Token.EMPTY) {
			return false;
		}
		int indexvalue = field.length - 1;

		while (field[indexvalue][column] != Token.EMPTY) {
			indexvalue--;
		}
		field[indexvalue][column] = playertoken;

		return true;
	}

}
