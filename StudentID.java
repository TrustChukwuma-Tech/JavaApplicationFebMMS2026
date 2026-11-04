import java.util.Random;

public class StudentID{
	public static void main(String[] args){
		Random rand = new Random();
		
		int num1 = Math.abs(rand.nextInt(90000) + 10000);
		String upperCase = "STU";
		
		String studentID = upperCase + num1;
		
		System.out.printf("The Student ID is %s%n",studentID);
	}	
}	