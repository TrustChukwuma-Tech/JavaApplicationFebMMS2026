import java.util.Scanner;

public class HeartRatesTest_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter birth month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter birth day: ");
        int day = input.nextInt();

        System.out.print("Enter birth year: ");
        int year = input.nextInt();

        try {
            HeartRates person = new HeartRates(firstName, lastName, month, day, year);

            System.out.println("\\nPERSONAL INFORMATION");
            System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
            System.out.println("Date of birth: " + person.getMonth() + "/"
                    + person.getDay() + "/" + person.getYear());
            System.out.println("Age: " + person.getAge() + " years");
            System.out.println("Maximum heart rate: " + person.getMaximumHeartRate()
                    + " beats per minute");
            System.out.println("Target heart rate: " + person.getTargetHeartRate());
        } catch (Exception e) {
            System.out.println("Invalid date of birth. Please enter a valid date.");
        }
    }
}
