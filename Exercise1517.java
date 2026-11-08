import java.util.Scanner;

public class Exercise1517{
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers? ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();
            System.out.println(number + (isEven(number) ? " is even." : " is odd."));
        }
        input.close();
    }
}
