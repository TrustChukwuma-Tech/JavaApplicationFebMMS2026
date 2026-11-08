import java.util.Scanner;
 
public class Exercise2320{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int employee = 1;
 
      while (employee <= 3) {
         System.out.printf("Employee %d hours worked: ", employee);
         double hours = input.nextDouble();
         System.out.printf("Employee %d hourly rate: ", employee);
         double rate = input.nextDouble();
 
         double pay;
         if (hours <= 40) {
            pay = hours * rate;
         } else {
            pay = 40 * rate + (hours - 40) * rate * 1.5;
         }
 
         System.out.printf("Employee %d pay: $%.2f%n%n", employee, pay);
         employee++;
      }
   }
}
