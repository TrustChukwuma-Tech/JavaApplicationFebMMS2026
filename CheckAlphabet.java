import java.util.Scanner;

public class CheckAlphabet{
	public static void main (String[] args){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter any alphabet from A-Z: ");	
		char letter = scan.next().charAt(0);
		
		switch(letter){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			    System.out.println(letter + " is a vowel");
			break;
			default:
			System.out.println(letter + " is a consonant");
		}	
		
	}	
}	