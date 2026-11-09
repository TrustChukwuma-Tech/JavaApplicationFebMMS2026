import java.util.Scanner;

public class Exercise6_18{
   private static final boolean[] seats = new boolean[10]; // false = empty

   // returns the first free seat number (1-10) in [from, to], or -1 if none
   private static int findSeat(int from, int to)
   {
      for (int seat = from; seat <= to; seat++)
         if (!seats[seat - 1])
            return seat;
      return -1;
   }

   private static void assign(int seat)
   {
      seats[seat - 1] = true;
      String section = seat <= 5 ? "First Class" : "Economy";
      System.out.println("----- BOARDING PASS -----");
      System.out.println("Seat number: " + seat);
      System.out.println("Section:     " + section);
      System.out.println("-------------------------");
   }

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      while (findSeat(1, 10) != -1)
      {
         System.out.println("Please type 1 for First Class");
         System.out.println("Please type 2 for Economy");
         System.out.print("Choice: ");
         int choice = input.nextInt();

         if (choice != 1 && choice != 2)
         {
            System.out.println("Invalid choice.");
            continue;
         }

         int seat = choice == 1 ? findSeat(1, 5) : findSeat(6, 10);

         if (seat != -1)
            assign(seat);
         else
         {
            String full = choice == 1 ? "First Class" : "Economy";
            String other = choice == 1 ? "Economy" : "First Class";
            System.out.printf("%s is full. Is it acceptable to be placed in %s? (y/n): ", full, other);
            String answer = input.next();

            if (answer.equalsIgnoreCase("y"))
               assign(choice == 1 ? findSeat(6, 10) : findSeat(1, 5));
            else
               System.out.println("Next flight leaves in 3 hours.");
         }
      }

      System.out.println("The plane is full.");
   }
}
