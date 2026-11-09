import java.util.Scanner;

public class Exercise6_29{
   // a) int version (iterative so that large n runs quickly)
   public static int fibonacci(int n)
   {
      int a = 0, b = 1;
      for (int i = 0; i < n; i++)
      {
         int next = a + b;
         a = b;
         b = next;
      }
      return a;
   }

   // c) double version
   public static double fibonacciDouble(int n)
   {
      double a = 0, b = 1;
      for (int i = 0; i < n; i++)
      {
         double next = a + b;
         a = b;
         b = next;
      }
      return a;
   }

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = input.nextInt();
      System.out.printf("fibonacci(%d) = %d%n", n, fibonacci(n));

      // b) largest Fibonacci number an int can hold
      int a = 0, b = 1, index = 0;
      try
      {
         while (true)
         {
            int next = Math.addExact(a, b);
            a = b;
            b = next;
            index++;
         }
      }
      catch (ArithmeticException e)
      {
         // a = F(index), b = F(index + 1); F(index + 2) overflowed, so b is the largest
         System.out.printf("b) Largest int Fibonacci: fibonacci(%d) = %d%n", index + 1, b);
      }

      // c) largest Fibonacci number a double can hold (before it becomes Infinity)
      int k = 0;
      while (!Double.isInfinite(fibonacciDouble(k + 1)))
         k++;
      System.out.printf("c) Largest finite double Fibonacci: fibonacci(%d) = %.6e%n",
         k, fibonacciDouble(k));
   }
}