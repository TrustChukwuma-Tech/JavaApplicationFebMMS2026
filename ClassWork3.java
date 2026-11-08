public class ClassWork3{
	public static void main(String[] args){
		int[] num = {8,2,5,12,6,3,7,11,13,4};
		
		int countOfEven = 0;
		int countOfOdd = 0;
		int sumOfOdd = 0;
		int sumOf2_6 = 0;
		int sumOf3_10 = 0;
		
		for(int i = 0; i < 10; i++){
			if(num[i] % 2 == 0){
				countOfEven++;
			}	
			else{
				countOfOdd++;
				sumOfOdd += num[i];
			}
             if(i > 1 && i <= 5){
			    sumOf2_6 += num[i];
			}		
        if(i > 2 || i <= 10){
			sumOf3_10 += num[i];
		}			   		
		}
		int result = sumOf3_10 - sumOf2_6;
        System.out.println("Find the count of even and ood numbers");
        System.out.println("-----------------------------------------");
		System.out.printf("The count of even is %d%n",countOfEven);
		System.out.printf("The count of odd is %d%n",countOfOdd);
		System.out.println("------------------------------------------\n");
		
		System.out.println("Find the sum of all the odd numbers");
		System.out.println("------------------------------------------");
		System.out.printf("The sum of all the odd numbers %d%n",sumOfOdd);
		System.out.println("------------------------------------------\n");
		
		System.out.println("Find the sum of 2_6 element subtract by" + "sum of 3_10 and find the result");
		System.out.println("-----------------------------------------");
		System.out.printf("%d - %d = %d",sumOf3_10,sumOf2_6,result);
        		
	}	
	
}	