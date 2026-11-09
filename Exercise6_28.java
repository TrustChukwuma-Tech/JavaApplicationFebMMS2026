import java.util.Random;

public class Exercise6_28{
   public static void main(String[] args)
   {
      Random random = new Random();
      int tortoise = 1, hare = 1;
      final int FINISH = 70;

      System.out.println("BANG !!!!!");
      System.out.println("AND THEY'RE OFF !!!!!");

      while (tortoise < FINISH && hare < FINISH)
      {
         int i = 1 + random.nextInt(10);

         // tortoise
         if (i <= 5)
            tortoise += 3;
         else if (i <= 7)
            tortoise -= 6;
         else
            tortoise += 1;

         // hare (new random number)
         i = 1 + random.nextInt(10);
         if (i <= 2)
            hare += 0;
         else if (i <= 4)
            hare += 9;
         else if (i == 5)
            hare -= 12;
         else if (i <= 8)
            hare += 1;
         else
            hare -= 2;

         if (tortoise < 1)
            tortoise = 1;
         if (hare < 1)
            hare = 1;

         // build the 70-position line
         StringBuilder line = new StringBuilder();
         int t = Math.min(tortoise, FINISH);
         int h = Math.min(hare, FINISH);

         if (t == h)
         {
            line.append(" ".repeat(t - 1)).append("OUCH!!!");
         }
         else
         {
            int first = Math.min(t, h);
            int second = Math.max(t, h);
            line.append(" ".repeat(first - 1)).append(first == t ? "T" : "H");
            line.append(" ".repeat(second - first - 1)).append(second == t ? "T" : "H");
         }
         System.out.println(line);
      }

      if (tortoise >= FINISH && hare >= FINISH)
         System.out.println("It's a tie.");
      else if (tortoise >= FINISH)
         System.out.println("TORTOISE WINS!!! YAY!!!");
      else
         System.out.println("Hare wins. Yuch.");
   }
}
