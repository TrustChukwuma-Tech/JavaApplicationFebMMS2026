import java.util.Random;

public class Exercise6_25{
   static final Random random = new Random();

   static boolean attacks(int r1, int c1, int r2, int c2)
   {
      return r1 == r2 || c1 == c2 || Math.abs(r1 - r2) == Math.abs(c1 - c2);
   }

   // ---------- a) random brute force: drop queens on random safe squares ----------
   static boolean randomAttempt(int[] rows, int[] cols)
   {
      int placed = 0;
      while (placed < 8)
      {
         // collect safe squares
         int[] safe = new int[64];
         int n = 0;
         for (int sq = 0; sq < 64; sq++)
         {
            boolean ok = true;
            for (int q = 0; q < placed && ok; q++)
               if (attacks(rows[q], cols[q], sq / 8, sq % 8))
                  ok = false;
            if (ok)
               safe[n++] = sq;
         }
         if (n == 0)
            return false;
         int pick = safe[random.nextInt(n)];
         rows[placed] = pick / 8;
         cols[placed] = pick % 8;
         placed++;
      }
      return true;
   }

   // ---------- b) exhaustive: every combination of 8 squares (in increasing order) ----------
   static int solutions = 0;
   static int[] firstSolution = null;
   static long combinationsTried = 0;

   static void exhaustive(int[] squares, int count, int startSquare)
   {
      if (count == 8)
      {
         combinationsTried++;
         solutions++;
         if (firstSolution == null)
            firstSolution = squares.clone();
         return;
      }
      for (int sq = startSquare; sq < 64; sq++)
      {
         boolean ok = true;
         for (int q = 0; q < count && ok; q++)
            if (attacks(squares[q] / 8, squares[q] % 8, sq / 8, sq % 8))
               ok = false;
         if (ok)
         {
            squares[count] = sq;
            exhaustive(squares, count + 1, sq + 1);
         }
      }
   }

   static void print(int[] rows, int[] cols)
   {
      char[][] board = new char[8][8];
      for (char[] row : board)
         java.util.Arrays.fill(row, '.');
      for (int q = 0; q < 8; q++)
         board[rows[q]][cols[q]] = 'Q';
      for (char[] row : board)
      {
         for (char ch : row)
            System.out.print(ch + " ");
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
      // a)
      int[] rows = new int[8], cols = new int[8];
      long attempts = 0;
      do
      {
         attempts++;
      } while (!randomAttempt(rows, cols));
      System.out.println("a) Random brute force found a solution after " + attempts + " attempts:");
      print(rows, cols);

      // b)
      long start = System.nanoTime();
      exhaustive(new int[8], 0, 0);
      double ms = (System.nanoTime() - start) / 1e6;
      System.out.printf("%nb) Exhaustive search found %d solutions in %.1f ms. The first one:%n",
         solutions, ms);
      int[] r = new int[8], c = new int[8];
      for (int q = 0; q < 8; q++)
      {
         r[q] = firstSolution[q] / 8;
         c[q] = firstSolution[q] % 8;
      }
      print(r, c);
   }
}