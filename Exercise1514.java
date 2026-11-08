import java.util.Scanner;

public class Exercise1514 {
    public static int integerPower(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) result *= base;
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base and positive exponent: ");
        int base = input.nextInt();
        int exponent = input.nextInt();
        System.out.println("Result: " + integerPower(base, exponent));
        input.close();
    }
}
