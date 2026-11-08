import java.util.Scanner;

public class Exercise1510 {
    public static double roundToInteger(double n) { return Math.floor(n + 0.5); }
    public static double roundToTenths(double n) { return Math.floor(n * 10 + 0.5) / 10; }
    public static double roundToHundredths(double n) { return Math.floor(n * 100 + 0.5) / 100; }
    public static double roundToThousandths(double n) { return Math.floor(n * 1000 + 0.5) / 1000; }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many values? ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number: ");
            double n = input.nextDouble();
            System.out.println("Original: " + n);
            System.out.println("Integer: " + roundToInteger(n));
            System.out.println("Tenths: " + roundToTenths(n));
            System.out.println("Hundredths: " + roundToHundredths(n));
            System.out.println("Thousandths: " + roundToThousandths(n));
        }
        input.close();
    }
}
