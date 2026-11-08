import java.util.Scanner;

public class Exercise1523 {
    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        System.out.println("Smallest: " + minimum3(a, b, c));
        input.close();
    }
}
