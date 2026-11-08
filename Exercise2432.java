public class Exercise2432 {
   public static void main(String[] args) {
      double users = 1.0;   // billions of users, October 2012
      int months = 0;
 
      while (users < 1.5) {
         users *= 1.04;
         months++;
      }
      System.out.printf("1.5 billion users after %d months%n", months);
 
      while (users < 2.0) {
         users *= 1.04;
         months++;
      }
      System.out.printf("2 billion users after %d months%n", months);
   }
}
