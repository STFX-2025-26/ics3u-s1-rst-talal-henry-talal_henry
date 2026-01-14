package henryJavaCode;
import java.util.Scanner;

public class RSTProject {

	public static void main(String[] args) {
		
		
		// variables
		int randomNum = 0;
		int userGuess = 0;
		int guessCounter = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		// generate random number from 1 to 99
		randomNum = (int)(Math.random() * 99) +1;
		
		// loop until user guesses right
		while (userGuess != randomNum)  {  
			
			
			// get users guess
			System.out.println("Enter Guess from 1 to 99");
			userGuess = sc.nextInt();
			
			guessCounter++;
			
			// check guess
			if (userGuess == randomNum)  {
				System.out.println("Correct!");
				System.out.println("Number of guesses: " + guessCounter);
				
			}
			else if  (userGuess > randomNum)  {
				System.out.println("Too high!");
			}
			else {
				System.out.println("Too low!");
			}
			
		}
		
		sc.close();
	}

}
