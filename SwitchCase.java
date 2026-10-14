import java.util.Scanner;

public class SwitchCase{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter fullname: ");
		String name = input.nextLine();
		
		System.out.print("Enter age: ");
		int age = input.nextInt();
		
		System.out.print("Enter Score: ");
		int score = input.nextInt();
		
		if(score >= 0 && score <= 10){
	    switch(score/10){
			    case 0:
			    case 1:
			    case 2:
		        case 3:
					System.out.println("Name: " + name);
					System.out.println("Age: " + age );
					System.out.println("Score: " + score);
					System.out.println("Grade: F");
				break;
				case 4:
					System.out.println("Name: " + name);
					System.out.println("Age: " + age );
					System.out.println("Score: " + score);
					System.out.println("Grade: D");
				break;
				case 5:
					System.out.println("Name: " + name);
					System.out.println("Age: " + age );
					System.out.println("Score: " + score);
					System.out.println("Grade: C");
				break;
				case 6:
					System.out.println("Name: " + name);
					System.out.println("Age: " + age );
					System.out.println("Score: " + score);
					System.out.println("Grade: B");
				break;
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("Name: " + name);
					System.out.println("Age: " + age );
					System.out.println("Score: " + score);
					System.out.println("Grade: A");
				break;
				default:
					System.out.println("invalid input" );
		}			
		}else{
			System.out.println("Score must be >= 0 AND <= 100");
		}			  
		
	}	
}	
		
				
		   
			
		   		   