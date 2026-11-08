import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise1536 {
    static SecureRandom random = new SecureRandom();

    public static int generateNumber() { return 1 + random.nextInt(9); }

    public static void response(boolean correct) {
        int choice = 1 + random.nextInt(4);
        switch (choice) {
            case 1:
                System.out.println(correct ? "Very good!" : "No. Please try again.");
                break;
            case 2:
                System.out.println(correct ? "Excellent!" : "Wrong. Try once more.");
                break;
            case 3:
                System.out.println(correct ? "Nice work!" : "Don't give up! No.");
                break;
            case 4:
                System.out.println(correct ? "Keep up the good work!" : "Keep trying.");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        while (keepGoing) {
            int a = generateNumber(), b = generateNumber(), answer;
            do {
                System.out.print("How much is " + a + " times " + b + "? ");
                answer = input.nextInt();
                response(answer == a * b);
            } while (answer != a * b);

            System.out.print("Continue? (y/n): ");
            keepGoing = input.next().equalsIgnoreCase("y");
        }
        input.close();
    }
}
