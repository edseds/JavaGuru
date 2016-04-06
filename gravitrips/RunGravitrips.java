package gravitrips;

public class RunGravitrips {

	public static void main(String[] args) {
		Game game = new Game();
		game.runGame(new HumanPlayer(), new HumanPlayer());
	}
/*!!!Output!!!:
 
Start the Gravitrips!

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  .  .  .  .  .  .  .
6  .  .  .  .  .  .  .
Player X make move:1

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  .  .  .  .  .  .  .
6  X  .  .  .  .  .  .
Player O make move:2

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  .  .  .  .  .  .  .
6  X  O  .  .  .  .  .
Player X make move:3

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  .  .  .  .  .  .  .
6  X  O  X  .  .  .  .
Player O make move:4

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  .  .  .  .  .  .  .
6  X  O  X  O  .  .  .
Player X make move:1

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  X  .  .  .  .  .  .
6  X  O  X  O  .  .  .
Player O make move:2

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  .  .  .  .  .  .  .
5  X  O  .  .  .  .  .
6  X  O  X  O  .  .  .
Player X make move:1

------------------------------------
Player: X win the game.

   1, 2, 3, 4, 5, 6, 7
1  .  .  .  .  .  .  .
2  .  .  .  .  .  .  .
3  .  .  .  .  .  .  .
4  X  .  .  .  .  .  .
5  X  O  .  .  .  .  .
6  X  O  X  O  .  .  .

*/
}
