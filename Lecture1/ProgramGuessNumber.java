import java.util.Scanner;

public class ProgramGuessNumber {

	static int min = 1;
	static int max = 100;
	static int number = 0;
	static int count = 1;
	static int computerGuess;

	public static void main(String[] args) {
		boolean stop = false;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Enter your number (between " + min + " and " + (max) + "): ");

			number = scan.nextInt();

			if (number < min || number >= max)
				System.out.println("That number is not between " + min + " and " + (max));
			else
				stop = true;
		} while (!stop);

		GuessNumber();

		scan.close();

		System.out.println("Computer found number: " + computerGuess + ", in " + count + " guesses");
	/*
	 Output:
	     Enter your number (between 1 and 100): 
         22
         Computer found number: 22, in 5 guesses 
	 */
	
	}

	public static void GuessNumber() {
		computerGuess = (max + min) / 2;

		while (number != computerGuess) {

			if (computerGuess < number) {

				min = computerGuess;
				computerGuess = (max + min) / 2;
			} else {

				max = computerGuess;
				computerGuess = (max + min) / 2;
			}
			count++;
		}
	}
}
