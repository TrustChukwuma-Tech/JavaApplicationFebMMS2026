import java.util.Scanner;
 
public class Exercise2411 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      System.out.print("How many values will you enter? ");
      int count = input.nextInt();
 
      if (count < 1) {
         System.out.println("There are no values to compare.");
         return;
      }
 
      System.out.print("Enter value 1: ");
      int smallest = input.nextInt();
 
      for (int i = 2; i <= count; i++) {
         System.out.printf("Enter value %d: ", i);
         int value = input.nextInt();
 
         if (value < smallest) {
            smallest = value;
         }
      }
 
      System.out.printf("Smallest value: %d%n", smallest);
   }
}
