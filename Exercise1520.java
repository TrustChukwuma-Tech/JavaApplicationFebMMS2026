import java.util.Scanner;

public class Exercise1520 {
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        System.out.println("Area: " + circleArea(radius));
        input.close();
    }
}
