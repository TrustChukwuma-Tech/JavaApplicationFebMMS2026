import java.util.Scanner;

public class Exercise158 {
    public static double calculateCharges(double hours) {
        if (hours <= 3) return 2.00;
        return Math.min(10.00, 2.00 + Math.ceil(hours - 3) * 0.50);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.print("Enter number of customers: ");
        int customers = input.nextInt();

        for (int i = 1; i <= customers; i++) {
            System.out.print("Hours parked by customer " + i + ": ");
            double hours = input.nextDouble();
            double charge = calculateCharges(hours);
            total += charge;
            System.out.printf("Charge: $%.2f%n", charge);
        }
        System.out.printf("Total receipts: $%.2f%n", total);
        input.close();
    }
}
