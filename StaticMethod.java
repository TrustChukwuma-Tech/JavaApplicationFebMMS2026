public class StaticMethod{
	public static void main(String[] args){
		int result1 = addNumbers(60,500);
		System.out.println("The answer is " + result1);
		
		int result2 = addNumbers(30,20);
		System.out.println("The answer is " + result2);
		
		int result3 = addNumbers(-500,1500);
		System.out.println("The answer is " + result3);
		
		int result4 = addNumbers(60,-500);
		System.out.println("The answer is " + result4);
		
		int result5 = StaticMethod.addNumbers(8,1000);
		System.out.println("The answer is " + result5);
	}
	public static int addNumbers(int num1 ,int num2){
		int addition = num1 + num2;
		
		return addition;
	}

}	