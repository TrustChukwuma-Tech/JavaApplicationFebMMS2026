import java.util.Random;
import java.util.Scanner;

public class BankApp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(90000000) + 10000000;
		String accountNumber = "30" + randomNumber;
		
		AccountType  accountType;
		
		System.out.print("Enter Customer Name: ");
		String name = input.nextLine();
		
		System.out.println("Select Account Type");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		System.out.println("3. Fixed Deposit");
		
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			        accountType = AccountType.SAVINGS; 
			break;
			
			case 2:
			        accountType = AccountType.CURRENT;  
			break;
			
			case 3:
			        accountType = AccountType.FIXED_DEPOSIT;   
			break;
			default:
			    System.out.println("invalid input"); 
				return;
		}	
		
		
		
		System.out.printf("Account Detail of %s%n",name);
		System.out.println("--------------------------------");
		System.out.printf("%-20s: %-15s","Full Name",name);
		System.out.printf("%-20s: %-15s","Account Type",accountType);
		System.out.printf("%-20s: %-15s","Account Number ",accountNumber);
		System.out.printf("%s Thanks for banking with us %n ",name);
		System.out.println("--------------------------------------------");
	}	
}	