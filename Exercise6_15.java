public class Exercise6_15{
   public static void main(String[] args)
   {
      int size = 10; // default

      if (args.length > 0)
      {
         try
         {
            size = Integer.parseInt(args[0]);
         }
         catch (NumberFormatException e)
         {
            System.out.println("Invalid size '" + args[0] + "', using 10.");
         }
      }

      if (size < 0)
      {
         System.out.println("Size cannot be negative, using 10.");
         size = 10;
      }

      int[] array = new int[size]; // elements are initialized to 0

      System.out.printf("%s%8s%n", "Index", "Value");
      for (int counter = 0; counter < array.length; counter++)
         System.out.printf("%5d%8d%n", counter, array[counter]);
   }
}
