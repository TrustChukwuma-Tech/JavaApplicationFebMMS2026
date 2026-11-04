public class AmericanFlag {
    public static void main(String[] args) {

        for (int row = 1; row <= 15; row++) {

            if (row <= 9) {

                if (row % 2 == 1) {
                    for (int star = 1; star <= 6; star++) {
                        System.out.print("* ");
                    }
                } else {
                    System.out.print(" ");

                    for (int star = 1; star <= 5; star++) {
                        System.out.print("* ");
                    }

                    System.out.print(" ");
                }

                for (int equal = 1; equal <= 34; equal++) {
                    System.out.print("=");
                }

            } else {

                for (int equal = 1; equal <= 46; equal++) {
                    System.out.print("=");
                }
            }

            System.out.println();
        }
    }
}