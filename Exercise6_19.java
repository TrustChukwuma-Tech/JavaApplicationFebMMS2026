import java.util.Scanner;

public class Exercise6_19{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      double[][] sales = new double[5][4]; // row = product, column = salesperson

      System.out.println("Enter sales slips: salesperson(1-4) product(1-5) value");
      System.out.println("Enter 0 as the salesperson number to finish.");

      while (true)
      {
         System.out.print("Slip: ");
         int person = input.nextInt();
         if (person == 0)
            break;
         int product = input.nextInt();
         double value = input.nextDouble();

         if (person < 1 || person > 4 || product < 1 || product > 5)
            System.out.println("Invalid salesperson or product number - slip ignored.");
         else
            sales[product - 1][person - 1] += value;
      }

      System.out.printf("%n%-10s", "Product");
      for (int p = 1; p <= 4; p++)
         System.out.printf("%12s", "Person " + p);
      System.out.printf("%12s%n", "Total");

      double[] columnTotals = new double[4];
      double grandTotal = 0;

      for (int product = 0; product < 5; product++)
      {
         double rowTotal = 0;
         System.out.printf("%-10d", product + 1);
         for (int person = 0; person < 4; person++)
         {
            System.out.printf("%12.2f", sales[product][person]);
            rowTotal += sales[product][person];
            columnTotals[person] += sales[product][person];
         }
         System.out.printf("%12.2f%n", rowTotal);
         grandTotal += rowTotal;
      }

      System.out.printf("%-10s", "Total");
      for (double t : columnTotals)
         System.out.printf("%12.2f", t);
      System.out.printf("%12.2f%n", grandTotal);
   }
}