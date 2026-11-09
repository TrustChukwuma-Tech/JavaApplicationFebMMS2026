import java.util.Random;

public class Exercise6_17{
   public static void main(String[] args)
   {
      Random randomNumbers = new Random();
      int[] frequency = new int[13]; // indices 2-12 are used

      for (int roll = 1; roll <= 36_000_000; roll++)
      {
         int die1 = 1 + randomNumbers.nextInt(6);
         int die2 = 1 + randomNumbers.nextInt(6);
         frequency[die1 + die2]++;
      }

      System.out.printf("%-5s%12s%10s%n", "Sum", "Frequency", "Percent");
      for (int sum = 2; sum <= 12; sum++)
         System.out.printf("%-5d%12d%9.2f%%%n", sum, frequency[sum],
            frequency[sum] * 100.0 / 36_000_000);
   }
}
