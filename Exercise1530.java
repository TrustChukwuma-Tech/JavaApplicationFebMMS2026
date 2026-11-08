import java.util.Random;
import java.util.Scanner;

public class Exercise1530 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String playAgain;

        do {
            int answer = 1 + random.nextInt(1000);
            int guess;
            System.out.println("Guess a number between 1 and 1000.");
            do {
                System.out.print("Your guess: ");
                guess = input.nextInt();
                if (guess > answer) System.out.println("Too high. Try again.");
                else if (guess < answer) System.out.println("Too low. Try again.");
                else System.out.println("Congratulations. You guessed the number!");
            } while (guess != answer);

            System.out.print("Play again? (y/n): ");
            playAgain = input.next();
        } while (playAgain.equalsIgnoreCase("y"));
        input.close();
    }
}
