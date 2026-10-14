import java.util.Scanner;

public class CheckGender{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		char choice ;
		
		System.out.print("Enter your name: ");
			String name = scan.nextLine();
		
		do{
			System.out.print("Are you a Female?: ");
			choice = scan.next().charAt(0);
			
		}while(choice == 'Y' || choice == 'y'); 
		System.out.printf("%s Sorry you are not a female");
		
	}	
}	