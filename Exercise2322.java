public class Exercise2322{
   public static void main(String[] args) {
      System.out.println("N\t10*N\t100*N\t1000*N\n");
 
      for (int n = 1; n <= 5; n++) {
         System.out.printf("%d\t%d\t%d\t%d%n", n, 10 * n, 100 * n, 1000 * n);
      }
   }
}

