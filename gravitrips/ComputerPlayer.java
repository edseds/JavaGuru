package gravitrips;

import java.util.Random;

public class ComputerPlayer extends Player {
	private Random randomNumber = new Random();

	@Override
	public void setMove(Board board) {
		int move = 0;
		board.printBoard();
		
		System.out.print("Computer player  " + getPlayerToken() + " make move:");

		do {
			move = randomNumber.nextInt(board.getColumns());
		} while ((board.getCell(move, 0) != Token.EMPTY));

		board.setCellValue(move, getPlayerToken());

		System.out.println(move);

	}
}
