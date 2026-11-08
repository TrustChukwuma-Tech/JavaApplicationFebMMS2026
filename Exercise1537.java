import java.security.SecureRandom;
import java.util.Scanner;

public class Exercise1537 {
    static SecureRandom random = new SecureRandom();

    public static int generateNumber() { return 1 + random.nextInt(9); }

    public static void response(boolean correct) {
        int choice = 1 + random.nextInt(4);
        String[] right = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
        String[] wrong = {"No. Please try again.", "Wrong. Try once more.",
                          "Don't give up! No.", "Keep trying."};
        System.out.println(correct ? right[choice - 1] : wrong[choice - 1]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean anotherStudent = true;

        while (anotherStudent) {
            int correctCount = 0, incorrectCount = 0;
            for (int i = 1; i <= 10; i++) {
                int a = generateNumber(), b = generateNumber();
                System.out.print("How much is " + a + " times " + b + "? ");
                int answer = input.nextInt();
                boolean correct = answer == a * b;
                response(correct);
                if (correct) correctCount++;
                else incorrectCount++;
            }

            double percentage = correctCount * 100.0 / 10;
            System.out.println("Correct: " + correctCount);
            System.out.println("Incorrect: " + incorrectCount);
            System.out.println("Percentage correct: " + percentage + "%");

            if (percentage < 75)
                System.out.println("Please ask your teacher for extra help.");
            else
                System.out.println("Congratulations, you are ready to go to the next level!");

            System.out.print("Another student? (y/n): ");
            anotherStudent = input.next().equalsIgnoreCase("y");
        }
        input.close();
    }
}
