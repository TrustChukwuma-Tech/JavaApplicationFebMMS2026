import java.util.Scanner;

public class Exercise1518 {
    public static void squareOfAsterisks(int side) {
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= side; column++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter square side: ");
        int side = input.nextInt();
        squareOfAsterisks(side);
        input.close();
    }
}
