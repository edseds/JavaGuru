package gravitrips;

import java.util.ArrayList;

public class Board {

	private ArrayList<ArrayList<Token>> field = new ArrayList<ArrayList<Token>>();

	public Board() {

		for (int i = 0; i < 6; i++) {

			ArrayList<Token> horisontal = new ArrayList<Token>();

			for (int j = 0; j < 7; j++) {

				horisontal.add(Token.EMPTY);

			}
			field.add(horisontal);
		}
	}

	public void printBoard() {
		System.out.println("");
		System.out.println("1, 2, 3, 4, 5, 6, 7");
		for (Integer i = 0; i < this.field.size(); i++) {
			ArrayList<Token> horisontal = field.get(i);
			Integer printInteger = i + 1;
			System.out.println(printInteger.toString() + ": " + horisontal.toString());

		}
	}

	public int getColumns() {
		return field.get(0).size();
	}

	public int getRows() {
		return field.size();
	}

	public Token getCell(int column, int row) {
		return field.get(row).get(column);
	}

	public boolean setCellValue(int column, Token playertoken) {
		if (field.get(0).get(column) != Token.EMPTY) {
			return false;
		}
		int indexvalue = field.size() - 1;

		while (field.get(indexvalue).get(column) != Token.EMPTY) {
			indexvalue--;
		}
		field.get(indexvalue).set(column, playertoken);

		return true;
	}

}
