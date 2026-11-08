import java.util.Random;
import java.util.Scanner;

public class Exercise1531 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String again;

        do {
            int answer = 1 + random.nextInt(1000);
            int guess, tries = 0;
            do {
                System.out.print("Guess a number between 1 and 1000: ");
                guess = input.nextInt();
                tries++;
                if (guess > answer) System.out.println("Too high. Try again.");
                else if (guess < answer) System.out.println("Too low. Try again.");
                else System.out.println("Congratulations. You guessed the number!");
            } while (guess != answer);

            if (tries < 10) System.out.println("Either you know the secret or you got lucky!");
            else if (tries == 10) System.out.println("Aha! You know the secret!");
            else System.out.println("You should be able to do better!");

            System.out.print("Play again? (y/n): ");
            again = input.next();
        } while (again.equalsIgnoreCase("y"));
        input.close();
    }
}
