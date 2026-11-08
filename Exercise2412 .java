public class Exercise2412 {
   public static void main(String[] args) {
      long product = 1;
 
      for (int odd = 1; odd <= 15; odd += 2) {
         product *= odd;
      }
 
      System.out.printf("Product of odd integers 1 to 15: %d%n", product);
   }
}
