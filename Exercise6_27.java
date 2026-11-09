public class Exercise6_27{
   public static void main(String[] args)
   {
      boolean[] isPrime = new boolean[1000];
      java.util.Arrays.fill(isPrime, true);
      isPrime[0] = false; // ignore elements 0 and 1
      isPrime[1] = false;

      for (int i = 2; i < isPrime.length; i++)
      {
         if (isPrime[i])
         {
            for (int multiple = 2 * i; multiple < isPrime.length; multiple += i)
               isPrime[multiple] = false;
         }
      }

      int count = 0;
      for (int i = 2; i < isPrime.length; i++)
      {
         if (isPrime[i])
         {
            System.out.printf("%5d", i);
            if (++count % 10 == 0)
               System.out.println();
         }
      }
      System.out.printf("%n%nThere are %d primes between 2 and 999.%n", count);
   }
}
