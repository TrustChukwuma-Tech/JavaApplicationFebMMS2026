public class Exercise2325{
   public static void main(String[] args) {
      for (int row = 1; row <= 8; row++) {
         if (row % 2 == 0) {
            System.out.print(" ");
         }
 
         for (int col = 1; col <= 8; col++) {
            System.out.print("* ");
         }
 
         System.out.println();
      }
   }
}

