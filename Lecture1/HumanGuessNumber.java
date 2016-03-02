import java.util.Scanner;

public class HumanGuessNumber {

	public static void main(String[] args) {

		int computernumber;
		int guessnumber;

		Scanner scanner = new Scanner(System.in);

		computernumber = (int) (Math.random() * 99 + 1);

		do {
			System.out.print("Enter a guess  (1-100): ");
			guessnumber = scanner.nextInt();

			if (guessnumber == computernumber)
				System.out.println("Your guess is correct.");
			else if (guessnumber < computernumber)
				System.out.println("Your guess is smaller than the computer number.");
			else if (guessnumber > computernumber)
				System.out.println("Your guess is greater than the computer number.");

		} while (guessnumber != computernumber);

		System.out.println("Good bye!");
		scanner.close();
		/*
		 Output:
		 Enter a guess  (1-100): 80
		 Your guess is greater than the computer number.
		 Enter a guess  (1-100): 60
		 Your guess is smaller than the computer number.
		 Enter a guess  (1-100): 70
		 Your guess is smaller than the computer number.
		 Enter a guess  (1-100): 75
		 Your guess is greater than the computer number.
		 Enter a guess  (1-100): 73
		 Your guess is correct.
		 Good bye!

		 */

	}

}
