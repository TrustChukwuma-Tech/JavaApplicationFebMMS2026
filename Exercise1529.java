import java.util.Random;
import java.util.Scanner;

public class Exercise1529 {
    enum Coin { HEADS, TAILS }

    public static Coin flip() {
        Random random = new Random();
        return random.nextBoolean() ? Coin.HEADS : Coin.TAILS;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heads = 0, tails = 0;
        String choice;
        do {
            System.out.print("Toss coin? (y/n): ");
            choice = input.next();
            if (choice.equalsIgnoreCase("y")) {
                Coin result = flip();
                System.out.println(result);
                if (result == Coin.HEADS) heads++;
                else tails++;
            }
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        input.close();
    }
}
