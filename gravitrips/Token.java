package gravitrips;

public enum Token {
	X("X"), O("O"), EMPTY(".");

	private String tokenValue;

	private Token(String value) {
		this.setTokenValue(value);
	}

	public String getTokenValue() {
		return tokenValue;
	}

	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	@Override
	public String toString() {
		return this.tokenValue;
	}

	public static Token getRandom() {
		int randomelement;
		do {
			randomelement = (int) (Math.random() * values().length);
		} while (values()[randomelement] == Token.EMPTY);

		return values()[randomelement];
	}
	// !!!!Deprecated!!!!:

	/*
	 * public static boolean isInEnum(Object value) { try { String move =
	 * value.toString(); for (Token t : Token.values()) { if (t.equals(move)) {
	 * return true; } } return false; } catch (Exception ex) { return false; } }
	 */

	/*
	 * public <E extends Enum<E>> boolean isInEnum(String value, Class<E>
	 * enumClass) { for (E e : enumClass.getEnumConstants()) {
	 * if(e.name().equals(value)) { return true; } } return false; }
	 */

}
