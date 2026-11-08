import java.util.Scanner;

public class Exercise159 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int count = input.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter a number: ");
            double x = input.nextDouble();
            double y = Math.floor(x + 0.5);
            System.out.println("Original: " + x + " Rounded: " + y);
        }
        input.close();
    }
}
