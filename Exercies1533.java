import java.util.Random;
import java.util.Scanner;

public class Exercies1533 {
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
