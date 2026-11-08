import java.util.Scanner;
 
public class Exercise2323 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;
      int counter = 1;
 
      while (counter <= 10) {
         System.out.printf("Enter number %d: ", counter);
         int number = input.nextInt();
 
         if (number > largest) {
            secondLargest = largest;
            largest = number;
         } else if (number > secondLargest) {
            secondLargest = number;
         }
 
         counter++;
      }
 
      System.out.printf("Largest: %d%n", largest);
      System.out.printf("Second largest: %d%n", secondLargest);
   }
}

