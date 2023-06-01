import java.util.*;
import java.util.Random;

class NumberGuessingGame
{
	public static void main(String[] args)
	{
		int startRange=1;
		int endRange=100;
		int MaxAttempts=10;
		int Score=0;

		System.out.println("WELCOME TO THE NUMBER GUESSING GAME ");
		System.out.println("I am Guessing number between "+ startRange+ " to "+endRange+);
		Random rand=new Random();
		int number = rand.nextInt(100);
	    System.out.println("Guess the Number between "+ startRange+ " to "+endRange+);

	    Scanner in=new Scanner(System.in);
	    boolean guessedCorrectly = false;
	    for(int attempts=1;attempts<=MaxAttempts;attempts++)
	    {
			System.out.println("Attempt "+attempts+ "/" +MaxAttempts+ );
			System.out.println("Enter your Guess");
			int guess=in.nextInt();
			if(guess==number)
			{
				guessedCorrectly =true;
				Score=Score+MaxAttempts-attempts+1;
				break;
			}
			else if(guess<number)
			{
				System.out.println("The number is higher than your guess .");
			}
			else
			{
				System.out.println("The number is Lower than your guess .");
			}
		}
		if (guessedCorrectly)
		{
            System.out.println("Congratulations! You guessed the number correctly.");
            System.out.println("Your score: " + score);
        }
        else
        {
            System.out.println("Sorry, you ran out of attempts. The number was: " + number);
            System.out.println("Better luck next time!");
        }
	}
}
