public class Exercise2413 {
   public static void main(String[] args) {
      long factorial = 1;
 
      System.out.printf("%-4s %22s%n", "n", "n!");
 
      for (int n = 1; n <= 20; n++) {
         factorial *= n;
         System.out.printf("%-4d %,22d%n", n, factorial);
      }
   }
}

