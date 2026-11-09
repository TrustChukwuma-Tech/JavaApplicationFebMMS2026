import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise6_22{
   static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
   static final int[] vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
   static final Random random = new Random();

   // one random tour from a random start square; returns number of squares visited
   static int randomTour(int[][] board)
   {
      int row = random.nextInt(8);
      int col = random.nextInt(8);
      int counter = 1;
      board[row][col] = counter;

      while (true)
      {
         List<Integer> legal = new ArrayList<>();
         for (int m = 0; m < 8; m++)
         {
            int nr = row + vertical[m];
            int nc = col + horizontal[m];
            if (nr >= 0 && nr < 8 && nc >= 0 && nc < 8 && board[nr][nc] == 0)
               legal.add(m);
         }
         if (legal.isEmpty())
            return counter;

         int m = legal.get(random.nextInt(legal.size()));
         row += vertical[m];
         col += horizontal[m];
         board[row][col] = ++counter;
      }
   }

   static void printTable(int[] tally)
   {
      System.out.printf("%-14s%s%n", "Tour length", "Number of tours");
      for (int len = 1; len <= 64; len++)
         if (tally[len] > 0)
            System.out.printf("%-14d%d%n", len, tally[len]);
   }

   public static void main(String[] args)
   {
      // part a) one tour
      int[][] board = new int[8][8];
      int length = randomTour(board);
      System.out.println("Part a) one random tour reached " + length + " squares:");
      for (int[] row : board)
      {
         for (int v : row)
            System.out.printf("%3d", v);
         System.out.println();
      }

      // part b) 1,000 tours
      int[] tally = new int[65];
      int best = 0;
      for (int t = 0; t < 1000; t++)
      {
         length = randomTour(new int[8][8]);
         tally[length]++;
         best = Math.max(best, length);
      }
      System.out.println("\nPart b) 1,000 tours. Best result: " + best + " squares");
      printTable(tally);

      // part c) until a full tour (with a time limit, because it can take extremely long)
      double limitSeconds = args.length > 0 ? Double.parseDouble(args[0]) : 10;
      tally = new int[65];
      long attempts = 0;
      long start = System.nanoTime();
      boolean found = false;
      best = 0;

      while (!found)
      {
         length = randomTour(new int[8][8]);
         tally[length]++;
         attempts++;
         best = Math.max(best, length);
         if (length == 64)
            found = true;
         else if (limitSeconds > 0 && (System.nanoTime() - start) / 1e9 > limitSeconds)
            break;
      }

      double seconds = (System.nanoTime() - start) / 1e9;
      System.out.printf("%nPart c) %d tours attempted in %.1f seconds. Full tour found: %b "
         + "(best length %d)%n", attempts, seconds, found, best);
      printTable(tally);
   }
}
