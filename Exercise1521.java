import java.util.Scanner;

public class Exercise1521 {
    public static int quotient(int a, int b) { return a / b; }
    public static int remainder(int a, int b) { return a % b; }

    public static void displayDigits(int number) {
        int divisor = 10000;
        boolean started = false;
        while (divisor > 0) {
            int digit = quotient(number, divisor);
            if (digit != 0 || started || divisor == 1) {
                System.out.print(digit);
                started = true;
                if (divisor > 1) System.out.print("   ");
            }
            number = remainder(number, divisor);
            divisor /= 10;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer from 1 to 99999: ");
        int number = input.nextInt();
        if (number >= 1 && number <= 99999) displayDigits(number);
        else System.out.println("Invalid number.");
        input.close();
    }
}
