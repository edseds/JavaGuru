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
}
