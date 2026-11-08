import java.util.Scanner;
 
public class Exercise2321 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      int counter = 1;
      System.out.print("Enter number 1: ");
      int number = input.nextInt();
      int largest = number;
      counter++;
 
      while (counter <= 10) {
         System.out.printf("Enter number %d: ", counter);
         number = input.nextInt();
 
         if (number > largest) {
            largest = number;
         }
 
         counter++;
      }
 
      System.out.printf("Largest number: %d%n", largest);
   }
}   
