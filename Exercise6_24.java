import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise6_24{
   static final Random random = new Random();

   // number of still-available squares that a queen on (r, c) would eliminate
   // (counting the queen's own square, so each corner of an empty board is 22)
   static int eliminationNumber(boolean[][] available, int r, int c)
   {
      int count = 0;
      for (int i = 0; i < 8; i++)
         for (int j = 0; j < 8; j++)
            if (available[i][j]
                && (i == r || j == c || Math.abs(i - r) == Math.abs(j - c)))
               count++;
      return count;
   }

   static void eliminate(boolean[][] available, int r, int c)
   {
      for (int i = 0; i < 8; i++)
         for (int j = 0; j < 8; j++)
            if (i == r || j == c || Math.abs(i - r) == Math.abs(j - c))
               available[i][j] = false;
   }

   // places queens on the available square with the smallest elimination number;
   // returns number of queens placed (8 = solution)
   static int placeQueens(char[][] board)
   {
      boolean[][] available = new boolean[8][8];
      for (boolean[] row : available)
         java.util.Arrays.fill(row, true);

      int placed = 0;
      while (true)
      {
         int best = Integer.MAX_VALUE;
         List<int[]> ties = new ArrayList<>();
         for (int r = 0; r < 8; r++)
            for (int c = 0; c < 8; c++)
               if (available[r][c])
               {
                  int e = eliminationNumber(available, r, c);
                  if (e < best)
                  {
                     best = e;
                     ties.clear();
                  }
                  if (e == best)
                     ties.add(new int[] {r, c});
               }

         if (ties.isEmpty())
            return placed;

         int[] pick = ties.get(random.nextInt(ties.size()));
         board[pick[0]][pick[1]] = 'Q';
         eliminate(available, pick[0], pick[1]);
         placed++;
      }
   }

   static void print(char[][] board)
   {
      for (char[] row : board)
      {
         for (char ch : row)
            System.out.print(ch + " ");
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
      // elimination numbers on an empty board (corners = 22)
      boolean[][] empty = new boolean[8][8];
      for (boolean[] row : empty)
         java.util.Arrays.fill(row, true);
      System.out.println("Elimination numbers on an empty board:");
      for (int r = 0; r < 8; r++)
      {
         for (int c = 0; c < 8; c++)
            System.out.printf("%3d", eliminationNumber(empty, r, c));
         System.out.println();
      }

      // run the heuristic; ties are broken randomly so we retry until 8 queens are placed
      int attempts = 0;
      int queens;
      char[][] board;
      do
      {
         board = new char[8][8];
         for (char[] row : board)
            java.util.Arrays.fill(row, '.');
         queens = placeQueens(board);
         attempts++;
      } while (queens < 8);

      System.out.println("\nSolution found after " + attempts + " heuristic run(s):");
      print(board);
   }
}
