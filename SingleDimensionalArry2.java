import java.util.Scanner;

public class SingleDimensionalArry2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = new int[20];
		
		for(int i = 1; i < 20; i++){
			System.out.print("Enter any number: ");
			numbers[i] = scan.nextInt();
	
		}	
		if(numbers[0] >= numbers[15]){
			System.out.println("Trust you must understand this oh!");
		}
		else{
			System.out.print("You will receive an extra assignment");
		}	
		
	}	
}	