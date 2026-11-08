import java.util.Scanner;

public class Exercise1515 {
    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the two shorter sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        System.out.println("Hypotenuse: " + hypotenuse(side1, side2));
        input.close();
    }
}
