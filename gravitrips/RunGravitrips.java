package gravitrips;

public class RunGravitrips {

	public static void main(String[] args) {
		Game game = new Game();
		game.runGame(new HumanPlayer(), new HumanPlayer());
	}
}
