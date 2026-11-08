import java.util.Random;
import java.util.Scanner;

public class Exercise1533 {
    enum Status { CONTINUE, WON, LOST }
    static Random random = new Random();

    public static int rollDice() {
        int die1 = 1 + random.nextInt(6);
        int die2 = 1 + random.nextInt(6);
        int sum = die1 + die2;
        System.out.println("Player rolled " + die1 + " + " + die2 + " = " + sum);
        return sum;
    }

    public static void chatter() {
        String[] messages = {
            "Oh, you're going for broke, huh?",
            "Aw c'mon, take a chance!",
            "You're up big. Now's the time to cash in your chips!"
        };
        System.out.println(messages[random.nextInt(messages.length)]);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bankBalance = 1000;

        while (bankBalance > 0) {
            System.out.println("Bank balance: $" + bankBalance);
            int wager;
            do {
                System.out.print("Enter wager: ");
                wager = input.nextInt();
            } while (wager <= 0 || wager > bankBalance);

            chatter();
            int sum = rollDice();
            int point = 0;
            Status status;

            if (sum == 7 || sum == 11) status = Status.WON;
            else if (sum == 2 || sum == 3 || sum == 12) status = Status.LOST;
            else {
                status = Status.CONTINUE;
                point = sum;
                System.out.println("Point is " + point);
            }

            while (status == Status.CONTINUE) {
                sum = rollDice();
                if (sum == point) status = Status.WON;
                else if (sum == 7) status = Status.LOST;
            }

            if (status == Status.WON) {
                bankBalance += wager;
                System.out.println("You won! New balance: $" + bankBalance);
            } else {
                bankBalance -= wager;
                System.out.println("You lost. New balance: $" + bankBalance);
            }
        }
        System.out.println("Sorry. You busted!");
        input.close();
    }
}
