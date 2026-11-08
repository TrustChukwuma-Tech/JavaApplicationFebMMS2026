import java.util.Scanner;

public class Exercise1528 {
    public static int qualityPoints(double average) {
        if (average >= 90 && average <= 100) return 4;
        if (average >= 80 && average < 90) return 3;
        if (average >= 70 && average < 80) return 2;
        if (average >= 60 && average < 70) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student average: ");
        double average = input.nextDouble();
        if (average < 0 || average > 100) System.out.println("Invalid average.");
        else System.out.println("Quality points: " + qualityPoints(average));
        input.close();
    }
}
