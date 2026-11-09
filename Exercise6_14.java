public class Exercise6_14{
   public static int product(int... numbers)
   {
      int result = 1;
      for (int n : numbers)
         result *= n;
      return result;
   }

   public static void main(String[] args)
   {
      System.out.println("product(2, 3) = " + product(2, 3));
      System.out.println("product(1, 2, 3, 4) = " + product(1, 2, 3, 4));
      System.out.println("product(5, 5, 5, 5, 5) = " + product(5, 5, 5, 5, 5));
      System.out.println("product(7) = " + product(7));
      System.out.println("product() = " + product());
   }
}
