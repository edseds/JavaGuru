import java.util.Scanner;

public class GreatestOfThreeVariables {

	public static void main(String[] args) {
		System.out.println("Input some numbers, to get greatest number from 3. To end program input 0.");
		
		Scanner scanner = new Scanner(System.in);

		int inputnumber;
		int greatestnumber = 0;
		
		int oddnumber = 0;
		int evennumber = 0;

		do {

			System.out.print("Input a number: ");

			inputnumber = scanner.nextInt();

			if (inputnumber != 0) {
				if (greatestnumber < inputnumber)
				{
					greatestnumber = inputnumber;
				}
				
				if(inputnumber%2==0)
					 evennumber++;
				else
					oddnumber++;
							
				System.out.println("Greatest number: " + greatestnumber);
			/*	Output:
			    Input some numbers, to get greatest number from 3. To end program input 0.
				Input a number: 3
				Greatest number: 3
				Input a number: 7
				Greatest number: 7
				Input a number: 2
				Greatest number: 7
				Input a number: 8
				Greatest number: 8
				Input a number: 0
				Good bye!
			*/
			}

		} while (inputnumber != 0);
		
		scanner.close();
		
		System.out.println("Odd numbers: " + oddnumber + ", Even numbers: " + evennumber);
		System.out.println("Good bye!");
     
		/*
           Odd numbers: 2, Even numbers: 2
           Good bye!
         */
	}

}
