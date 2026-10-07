import java.util.Scanner;

public class DoubleSeletion{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter FullName: ");
		String fullname = scan.nextLine();
		
		System.out.print("Enter username: ");
		String username = scan.nextLine();
		
		System.out.print("Enter password: ");
		String password = scan.nextLine();
		
		if(username.equals("johnnydeep") && password.equals("12345")){
			System.out.println("Access Granted");
			System.out.println(fullname + "you are welcome");	
		}
		else{
			System.out.println("Access Denied");
		}	
	}
}	