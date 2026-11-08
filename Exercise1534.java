public class Exercise1534 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-15s %-10s %-10s%n",
                          "Decimal", "Binary", "Octal", "Hexadecimal");
        for (int n = 1; n <= 256; n++) {
            System.out.printf("%-10d %-15s %-10s %-10s%n",
                n, Integer.toBinaryString(n),
                Integer.toOctalString(n), Integer.toHexString(n).toUpperCase());
        }
    }
}
