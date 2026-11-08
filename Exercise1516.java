import java.util.Scanner;

public class Exercise1516 {
    public static boolean isMultiple(int first, int second) {
        return first != 0 && second % first == 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many pairs? ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter two integers: ");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(isMultiple(a, b) ? b + " is a multiple of " + a
                                                : b + " is not a multiple of " + a);
        }
        input.close();
    }
}
