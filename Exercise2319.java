import java.util.Scanner;
 
public class Exercise2319 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double grossSales = 0.0;
 
      System.out.print("Enter item number 1-4 (-1 to finish): ");
      int item = input.nextInt();
 
      while (item != -1) {
         double value;
 
         switch (item) {
            case 1: value = 239.99; break;
            case 2: value = 129.75; break;
            case 3: value = 99.95; break;
            case 4: value = 350.89; break;
            default: value = 0.0;
         }
 
         if (value == 0.0) {
            System.out.println("Invalid item number.");
         } else {
            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();
            grossSales += value * quantity;
         }
 
         System.out.print("Enter item number 1-4 (-1 to finish): ");
         item = input.nextInt();
	    }
    }
}	
 
