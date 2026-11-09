import java.time.LocalDate;
import java.time.Period;

public class HeartRates_7 {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;

    public HeartRates(String firstName, String lastName, int month, int day, int year) {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(month, day, year);
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setDateOfBirth(int month, int day, int year) {
        LocalDate.of(year, month, day); // validates the date
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() { return month; }
    public int getDay() { return day; }
    public int getYear() { return year; }

    public int getAge() {
        LocalDate birthDate = LocalDate.of(year, month, day);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public int getMaximumHeartRate() {
        return 220 - getAge();
    }

    public String getTargetHeartRate() {
        double maximum = getMaximumHeartRate();
        int lower = (int) Math.round(maximum * 0.50);
        int upper = (int) Math.round(maximum * 0.85);
        return lower + " - " + upper + " beats per minute";
    }
}
