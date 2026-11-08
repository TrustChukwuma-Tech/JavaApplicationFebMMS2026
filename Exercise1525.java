public class Exercise1525 {
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++)
            if (number % divisor == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int n = 2; n < 10000; n++) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println("\\nNumber of primes less than 10000: " + count);
    }
}
