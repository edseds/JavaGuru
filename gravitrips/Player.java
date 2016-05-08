package gravitrips;

import gravitrips.Token;

public abstract class Player {

	private Token playertoken;

	public void setToken(Token token) {
		this.playertoken = token;
	}

	public Token getPlayerToken() {
		return playertoken;
	}

	public abstract void setMove(Board board);
}
