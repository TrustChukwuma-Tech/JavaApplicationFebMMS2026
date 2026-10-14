import java.util.Scanner;

public class Caculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Caculate any two numbers");
		
		System.out.print("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = input.nextInt();
		
		System.out.print("Enter any of thesze symbols +,-,*,/,% ");
		char symbol = input.next().charAt(0);
	    System.out.println("---------------------------------------\n");
		
		switch(symbol){
			case '+':
			        int addition = num1 + num2;  
			        System.out.printf("%d + %d = %d",num1,num2,addition ); 
			break;
			case '-':
			        int subtraction = num1 - num2;  
			        System.out.printf("%d - %d = %d",num1,num2,subtraction ); 
			break;
			case '*':
			        int multiplication = num1 * num2;  
			        System.out.printf("%d * %d = %d",num1,num2,multiplication ); 
			break;
			case '/':
			        int division = num1 / num2;  
			        System.out.printf("%d / %d = %d",num1,num2,division ); 
			break;
			case '%':
			        int remainder = num1 + num2;  
			        System.out.printf("%d %% %d = %d",num1,num2,remainder ); 
			break;
		    default:
			    System.out.println("Invalid input");
		}	
	}	
}	