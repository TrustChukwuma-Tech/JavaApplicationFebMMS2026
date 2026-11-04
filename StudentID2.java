import java.util.Random;

public class StudentID2{
	public static void main(String[] args){
		Random rand = new Random();
		
		String upperCase = "STU";
	
		
		for(int i = 1;i <= 3; i++){
	
			
			int num2 = rand.nextInt(90000) + 10000;
			
			
			String studentID = upperCase + num2;
			
			System.out.printf("The Student ID is %s%n",studentID);
		}	
		
		
	}	
}	