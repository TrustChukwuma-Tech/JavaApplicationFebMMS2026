import java.util.Random;

public class Exerices1512 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 1 + random.nextInt(2);
        int b = 1 + random.nextInt(100);
        int c = random.nextInt(10);
        int d = 1000 + random.nextInt(113);
        int e = -1 + random.nextInt(3);
        int f = -3 + random.nextInt(15);

        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f);
    }
}
