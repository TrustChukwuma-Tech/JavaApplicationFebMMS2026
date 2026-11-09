public class Exercise6_16{
   public static void main(String[] args)
   {
      double total = 0;

      for (String argument : args)
      {
         try
         {
            total += Double.parseDouble(argument);
         }
         catch (NumberFormatException e)
         {
            System.out.println("Skipping non-numeric argument: " + argument);
         }
      }

      System.out.println("Sum = " + total);
   }
}