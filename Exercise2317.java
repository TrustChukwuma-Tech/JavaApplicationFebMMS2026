import java.util.Scanner;
 
public class Exercise2317{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int totalMiles = 0;
      int totalGallons = 0;
 
      System.out.print("Enter miles driven (-1 to quit): ");
      int miles = input.nextInt();
 
      while (miles != -1) {
         System.out.print("Enter gallons used: ");
         int gallons = input.nextInt();
 
         if (gallons > 0) {
            totalMiles += miles;
            totalGallons += gallons;
            double tripMpg = (double) miles / gallons;
            double combinedMpg = (double) totalMiles / totalGallons;
            System.out.printf("MPG this trip: %.2f%n", tripMpg);
            System.out.printf("Combined MPG: %.2f%n", combinedMpg);
         } else {
            System.out.println("Gallons must be above 0. Trip ignored.");
         }
 
         System.out.print("\nEnter miles driven (-1 to quit): ");
         miles = input.nextInt();
      }
   }
}
