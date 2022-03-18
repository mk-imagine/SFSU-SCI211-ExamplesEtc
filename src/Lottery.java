import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a lottery
        int lottery = (int) (Math.random() * 100);	// generate a random two digit number from 0 - 100

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from lottery let's say 59
        int lotteryDigit1 =	(lottery / 10);		// store the first lottery digit here
        int lotteryDigit2 =	(lottery % 10);	    // store the second lottery digit here

        // Get digits from guess
        int guessDigit1 = (guess / 10);			// store the first guess digit here
        int guessDigit2 = (guess % 10);         // store the second guess digit here

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if ( lottery == guess ) {			// exact match
            System.out.println("Exact match: you win $10,000");
        } else if ( lotteryDigit2 == guessDigit1 && lotteryDigit1 == guessDigit2 ) {	// match both digits but not in the same order
            System.out.println("Match all digits: you win $3,000");
        } else if ( lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2) {	// match a single digit
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
