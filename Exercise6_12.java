import java.util.Scanner;

public class Exercise6_12{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int[] unique = new int[5]; // smallest array: worst case is five different numbers
      int count = 0;

      for (int n = 1; n <= 5; n++)
      {
         int number;
         do
         {
            System.out.printf("Enter number %d (10-100): ", n);
            number = input.nextInt();
         } while (number < 10 || number > 100);

         boolean duplicate = false;
         for (int i = 0; i < count; i++)
         {
            if (unique[i] == number)
            {
               duplicate = true;
               break;
            }
         }

         if (!duplicate)
         {
            unique[count++] = number;
            System.out.println(number + " is not a duplicate.");
         }
         else
            System.out.println(number + " is a duplicate - not displayed again.");

         System.out.print("Unique values so far:");
         for (int i = 0; i < count; i++)
            System.out.print(" " + unique[i]);
         System.out.println();
      }
   }
}
