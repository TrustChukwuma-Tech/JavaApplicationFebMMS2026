import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise1535 {
    static SecureRandom random = new SecureRandom();

    public static int generateNumber() {
        return 1 + random.nextInt(9);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            int a = generateNumber();
            int b = generateNumber();
            int answer;
            do {
                System.out.print("How much is " + a + " times " + b + "? ");
                answer = input.nextInt();
                if (answer == a * b) System.out.println("Very good!");
                else System.out.println("No. Please try again.");
            } while (answer != a * b);

            System.out.print("Ask another question? (y/n): ");
            continueProgram = input.next().equalsIgnoreCase("y");
        }
        input.close();
    }
}
