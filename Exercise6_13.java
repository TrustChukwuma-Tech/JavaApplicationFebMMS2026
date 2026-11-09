public class Exercise6_13{
   public static void main(String[] args)
   {
      int[][] sales = new int[3][5];
      int order = 1;
      int[][] label = new int[3][5];

      for (int row = 0; row < sales.length; row++)
      {
         for (int col = 0; col < sales[row].length; col++)
         {
            sales[row][col] = 0;
            label[row][col] = order++;
         }
      }

      for (int[] row : label)
      {
         for (int value : row)
            System.out.printf("%4d", value);
         System.out.println();
      }
   }
}
