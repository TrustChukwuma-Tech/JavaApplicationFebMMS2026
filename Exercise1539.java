import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise1539 {
    static SecureRandom random = new SecureRandom();

    public static int generateNumber(int difficulty) {
        return random.nextInt((int) Math.pow(10, difficulty));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter difficulty level: ");
        int difficulty = input.nextInt();
        System.out.println("1 Addition  2 Subtraction  3 Multiplication");
        System.out.println("4 Division  5 Random mixture");
        System.out.print("Choose problem type: ");
        int type = input.nextInt();

        if (difficulty < 1 || type < 1 || type > 5) {
            System.out.println("Invalid selection.");
            input.close();
            return;
        }

        boolean again = true;
        while (again) {
            int operation = (type == 5) ? 1 + random.nextInt(4) : type;
            int a = generateNumber(difficulty);
            int b = generateNumber(difficulty);
            if (operation == 4 && b == 0) b = 1;

            int correctAnswer = 0;
            String symbol = "";
            switch (operation) {
                case 1: correctAnswer = a + b; symbol = "+"; break;
                case 2: correctAnswer = a - b; symbol = "-"; break;
                case 3: correctAnswer = a * b; symbol = "*"; break;
                case 4:
                    // Use exact integer division so the answer is a whole number.
                    correctAnswer = a;
                    a = a * b;
                    symbol = "/";
                    break;
            }

            int answer;
            do {
                System.out.print("How much is " + a + " " + symbol + " " + b + "? ");
                answer = input.nextInt();
                if (answer == correctAnswer) System.out.println("Very good!");
                else System.out.println("No. Please try again.");
            } while (answer != correctAnswer);

            System.out.print("Another question? (y/n): ");
            again = input.next().equalsIgnoreCase("y");
        }
        input.close();
    }
}
