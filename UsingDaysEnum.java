import java.util.Scanner;

public class UsingDaysEnum{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter day from 1 - 7 :");
		int day = scan.nextInt();
		
		switch(day){
			case 1:
			        Days day1 = Days.SUNDAY;
                    System.out.printf("The day you enter is %s%n",day1); 					
			break;
			
			case 2:
			        Days day2 = Days.MONDAY;
                    System.out.printf("The day you enter is %s%n",day2);   
			break;
			
			case 3:
			        Days day3 = Days.TUESDAY;
                    System.out.printf("The day you enter is %s%n",day3);   
			break;
			
			case 4:
			        Days day4 = Days.WEDNESDAY;
                    System.out.printf("The day you enter is %s%n",day4);    
			break;
			
			case 5:
			        Days day5 = Days.THURSDAY;
                    System.out.printf("The day you enter is %s%n",day5);  
			break;
			
            case 6:
			        Days day6 = Days.FRIDAY;
                    System.out.printf("The day you enter is %s%n",day6);
					
			break;
			
			case 7:
			        Days day7 = Days.SATURDAY;
                    System.out.printf("The day you enter is %s%n",day7);
			break;
			
			default:
			    System.out.println("invalid Day"); 
		}	
	}	
}	