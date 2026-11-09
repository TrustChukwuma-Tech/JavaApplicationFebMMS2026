public class Exercise6_20{
   private static final int SIZE = 20;
   private static int[][] floor = new int[SIZE][SIZE];
   private static int row = 0, col = 0;     // turtle starts at (0, 0)
   private static int direction = 0;        // 0 = right, 1 = down, 2 = left, 3 = up
   private static boolean penDown = false;  // pen starts up

   private static final int[] DR = {0, 1, 0, -1};
   private static final int[] DC = {1, 0, -1, 0};

   private static void move(int steps)
   {
      for (int i = 0; i < steps; i++)
      {
         if (penDown)
            floor[row][col] = 1;

         int nr = row + DR[direction];
         int nc = col + DC[direction];
         if (nr < 0 || nr >= SIZE || nc < 0 || nc >= SIZE)
            break; // stop at the edge of the floor

         row = nr;
         col = nc;
         if (penDown)
            floor[row][col] = 1;
      }
   }

   private static void display()
   {
      for (int[] r : floor)
      {
         for (int cell : r)
            System.out.print(cell == 1 ? "* " : "  ");
         System.out.println();
      }
      System.out.println("-".repeat(SIZE * 2));
   }

   private static void reset()
   {
      floor = new int[SIZE][SIZE];
      row = 0;
      col = 0;
      direction = 0;
      penDown = false;
   }

   // each command is {code} or {code, argument}
   private static void run(int[][] program)
   {
      for (int[] cmd : program)
      {
         switch (cmd[0])
         {
            case 1: penDown = false; break;
            case 2: penDown = true; break;
            case 3: direction = (direction + 1) % 4; break;
            case 4: direction = (direction + 3) % 4; break;
            case 5: move(cmd[1]); break;
            case 6: display(); break;
            case 7: floor = new int[SIZE][SIZE]; break;
            case 8:
               direction = (direction + 2) % 4;
               move(cmd[1]);
               direction = (direction + 2) % 4;
               break;
            case 9: return;
            default: System.out.println("Unknown command " + cmd[0]);
         }
      }
   }

   public static void main(String[] args)
   {
      System.out.println("Program 1: 12-by-12 square (from the exercise)");
      reset();
      run(new int[][] {{2}, {5, 12}, {3}, {5, 12}, {3}, {5, 12}, {3}, {5, 12},
                       {1}, {6}, {9}});

      System.out.println("Program 2: 16-by-7 rectangle");
      reset();
      run(new int[][] {{2}, {5, 15}, {3}, {5, 6}, {3}, {5, 15}, {3}, {5, 6},
                       {1}, {6}, {9}});

      System.out.println("Program 3: staircase");
      reset();
      run(new int[][] {{2}, {5, 3}, {3}, {5, 3}, {4}, {5, 3}, {3}, {5, 3}, {4},
                       {5, 3}, {3}, {5, 3}, {4}, {5, 3}, {1}, {6}, {9}});

      System.out.println("Program 4: uses extra commands (backward move, clear)");
      reset();
      run(new int[][] {{2}, {5, 10}, {3}, {5, 10}, {7}, {2}, {8, 5}, {1}, {6}, {9}});
   }
}
