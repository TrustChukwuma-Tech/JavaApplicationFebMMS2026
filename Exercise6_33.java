import java.util.Scanner;

public class Exercise6_33
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String[] topics = {"Climate change", "Poverty reduction", "Quality education",
                         "Healthcare access", "Clean water"};
      int[][] responses = new int[5][10]; // [topic][rating - 1] = number of ratings

      System.out.print("How many people are taking the survey? ");
      int people = input.nextInt();

      for (int person = 1; person <= people; person++)
      {
         System.out.printf("%nRespondent %d - rate each issue from 1 (least important) "
            + "to 10 (most important)%n", person);
         for (int t = 0; t < topics.length; t++)
         {
            int rating;
            do
            {
               System.out.printf("  %s: ", topics[t]);
               rating = input.nextInt();
            } while (rating < 1 || rating > 10);
            responses[t][rating - 1]++;
         }
      }

      // a) and b) tabular report with averages
      System.out.printf("%n%-20s", "Topic");
      for (int rating = 1; rating <= 10; rating++)
         System.out.printf("%4d", rating);
      System.out.printf("%10s%n", "Average");

      int[] totals = new int[topics.length];
      for (int t = 0; t < topics.length; t++)
      {
         System.out.printf("%-20s", topics[t]);
         int responseCount = 0;
         for (int rating = 1; rating <= 10; rating++)
         {
            int count = responses[t][rating - 1];
            System.out.printf("%4d", count);
            totals[t] += rating * count;
            responseCount += count;
         }
         double average = responseCount == 0 ? 0 : (double) totals[t] / responseCount;
         System.out.printf("%10.2f%n", average);
      }

      // c) and d) highest and lowest point totals
      int highest = 0, lowest = 0;
      for (int t = 1; t < topics.length; t++)
      {
         if (totals[t] > totals[highest])
            highest = t;
         if (totals[t] < totals[lowest])
            lowest = t;
      }
      System.out.printf("%nHighest point total: %s (%d points)%n", topics[highest], totals[highest]);
      System.out.printf("Lowest point total:  %s (%d points)%n", topics[lowest], totals[lowest]);
   }
}