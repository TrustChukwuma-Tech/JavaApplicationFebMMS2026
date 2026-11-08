import java.util.Scanner;

public class Exercise1519 {
    public static void squareOfCharacter(int side, char fillCharacter) {
        for (int row = 1; row <= side; row++) {
            for (int column = 1; column <= side; column++)
                System.out.print(fillCharacter);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter square side: ");
        int side = input.nextInt();
        System.out.print("Enter fill character: ");
        char fill = input.next().charAt(0);
        squareOfCharacter(side, fill);
        input.close();
    }
}
