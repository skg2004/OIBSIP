import java.util.Random;
import java.util.Scanner;
public class NUMBER_GUESSING_GAME {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the lower limit of the range between which you want to generate the number: ");
        final int lower = sc.nextInt();
        System.out.println("Enter the higher limit of the range between which you want to generate the number: ");
        final int higher = sc.nextInt();
        int computer_guess = rand.nextInt(lower,higher);
        int attempts =0;
        int score_after_attempt = 0;
        final int Tot_score =100;
        System.out.println("The user get only 10 attempts\nThe user get a total score of 100");
        System.out.println("score per attempts is equal to 10");
        int attempts_left = 0;
        System.out.println(computer_guess);
        while (attempts!=10){
            attempts+=1;
            attempts_left= 10-attempts;
            System.out.println("Guess the number");
            int user_guess = sc.nextInt();
            if (user_guess>computer_guess){
                System.out.println("User guess is greater than the computer guess");
                score_after_attempt = Tot_score-attempts*10;
                System.out.println("Final score left out of 100 is: "+score_after_attempt);
                System.out.println("No of attempts left "+attempts_left);
            }
            else if (user_guess<computer_guess) {
                System.out.println("User guess is less than the computer guess");
                score_after_attempt = Tot_score-attempts*10;
                System.out.println("Final score left out of 100 is: "+score_after_attempt);
            }
            else if (user_guess==computer_guess){
                System.out.println("User guess is less than the computer guess");
                score_after_attempt = Tot_score-attempts*10;
                System.out.println("The user guess in "+attempts+" attempts");
                System.out.println("Final score left out of 100 is: "+score_after_attempt);
                break;
            }
            else {
                System.out.println("The user was no able to guess the correct number\nPlease Play the game again!!!");
            }
        }

    }
}