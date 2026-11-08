import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise1538 {
    static SecureRandom random = new SecureRandom();

    public static int generateNumber(int difficulty) {
        int upperLimit = (int) Math.pow(10, difficulty);
        return random.nextInt(upperLimit);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter difficulty level (1, 2, 3...): ");
        int level = input.nextInt();
        if (level < 1) {
            System.out.println("Difficulty must be at least 1.");
            input.close();
            return;
        }

        boolean again = true;
        while (again) {
            int a = generateNumber(level);
            int b = generateNumber(level);
            int answer;
            do {
                System.out.print("How much is " + a + " times " + b + "? ");
                answer = input.nextInt();
                if (answer == a * b) System.out.println("Very good!");
                else System.out.println("No. Please try again.");
            } while (answer != a * b);

            System.out.print("Another question? (y/n): ");
            again = input.next().equalsIgnoreCase("y");
        }
        input.close();
    }
}
