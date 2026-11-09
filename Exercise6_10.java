import java.util.Scanner;

public class Exercise6_10{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] counters = new int[9]; // index 0 = $200-299, ..., index 8 = $1000 and over

      System.out.println("Enter each salesperson's weekly gross sales (negative number to stop):");
      System.out.print("Gross sales: ");
      double sales = input.nextDouble();

      while (sales >= 0)
      {
         int salary = (int) (200 + 0.09 * sales); // truncated to an integer
         int index = Math.min(salary / 100 - 2, 8); // 200-299 -> 0, ..., 1000+ -> 8
         if (index >= 0) // salary is always at least $200, so this is always true
            counters[index]++;

         System.out.print("Gross sales: ");
         sales = input.nextDouble();
      }

      System.out.printf("%nEmployees in each salary range:%n");
      for (int i = 0; i < counters.length; i++)
      {
         String range;
         if (i == 8)
            range = "$1,000 and over";
         else
            range = String.format("$%d-%d", 200 + i * 100, 299 + i * 100);
         System.out.printf("%-18s%d%n", range, counters[i]);
      }
   }
}
