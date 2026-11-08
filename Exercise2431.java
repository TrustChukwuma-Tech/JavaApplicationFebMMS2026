import java.util.Scanner;
 
public class Exercise2431 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
 
      // 23% is a tax-inclusive rate: tax = 23% of (price + tax)
      final double INCLUSIVE_RATE = 0.23;
      double exclusiveRate = INCLUSIVE_RATE / (1 - INCLUSIVE_RATE);
 
      System.out.println("Enter yearly spending before tax:");
      System.out.print("  Housing: ");
      double expenses = input.nextDouble();
      System.out.print("  Food: ");
      expenses += input.nextDouble();
      System.out.print("  Clothing: ");
      expenses += input.nextDouble();
      System.out.print("  Transportation: ");
      expenses += input.nextDouble();
      System.out.print("  Education: ");
      expenses += input.nextDouble();
      System.out.print("  Health care: ");
      expenses += input.nextDouble();
      System.out.print("  Vacations: ");
      expenses += input.nextDouble();
 
      double tax = expenses * exclusiveRate;
 
      System.out.printf("%nSpending before tax: $%,.2f%n", expenses);
      System.out.printf("Estimated FairTax:    $%,.2f%n", tax);
      System.out.printf("Total with tax:       $%,.2f%n", expenses + tax);
      System.out.printf("Rate on pre-tax price: %.1f%%%n",
         exclusiveRate * 100);
      System.out.printf("Rate on total paid:    %.1f%%%n",
         INCLUSIVE_RATE * 100);
   }
}


