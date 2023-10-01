import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
    public static void main(String[] args){

        System.out.println("Guess the number! ");
        System.out.println("Enter the range..");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter lower bound value: ");
        int lowerBound = scanner.nextInt();
        System.out.println("Enter upper bound value: ");
        int upperBound = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound; // corrected this line

        System.out.println("I have chosen a number between "+lowerBound+" and "+upperBound);

        int score = 0;
        boolean correctGuess = false;

        while(!correctGuess){
            System.out.println("Can you guess the number? ");
            int userGuess = scanner.nextInt();
            score ++;

            if(userGuess < lowerBound || userGuess > upperBound){
                System.out.println("Choose a number within specified range please!");
            }
            else if(userGuess > randomNumber){
                System.out.println("Try choosing a smaller number");
            }
            else if(userGuess < randomNumber){
                System.out.println("Try choosing a greater number");
            }
            else{
                correctGuess = true;
                System.out.println("You guessed right!");
                System.out.println("Your score is : " + score);

            }
        }
    }
}
