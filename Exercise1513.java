import java.util.Random;

public class Exercise1513 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 2 + 2 * random.nextInt(5);
        int b = 3 + 2 * random.nextInt(5);
        int c = 6 + 4 * random.nextInt(5);

        System.out.println("Set A: " + a);
        System.out.println("Set B: " + b);
        System.out.println("Set C: " + c);
    }
}
