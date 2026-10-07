public class OperatorsPart1{
	
	public static void main(String[] args){
		//Assignment operator(=)
		int num = 100;
		System.out.printf("Number is %d%n",num);
		
		//Arithmetic operators(+,-,*,/,%)
		int num1 = 123;
		int num2 = 200;
		
		int addition = num1 + num2;
		int subtraction = num1 - num2;
		int multiplcation = num1 * num2;
		double division = (double) num1 / num2;
		int reminder = num1 % num2;
		
		//Compound assignment operator(+=,-=,*=,/=,%=)
		int number1 = 20;
		int number2 =2;
		
		
		
		
		
		
		System.out.println("--------Arithemeti output------------------");
		
		System.out.printf("%d + %d = %d%n",num1,num2,addition);
		System.out.printf("%d - %d = %d%n",num1,num2,subtraction);
		System.out.printf("%d x %d = %d%n",num1,num2,multiplcation);
		System.out.printf("%d / %d = %.2f%n",num1,num2,division);
		System.out.printf("%d %% %d = %d%n",num1,num2,reminder);
		System.out.println("---------------------------------------");
		
		System.out.println("---------Compound Assinment Output---------");
		
		number1 += number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 -= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 *= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 /= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		
		number1 %= number2;
		System.out.printf("The value of number1 has been updated to %d%n",number1);
		System.out.println("-----------------------------------------------------");
		
		// Relational operator(>,<,>=,<=,==,!=)
		int x = 90;
		int y = 51;
		
		boolean isGreater = x > y;
		boolean isLessThan = x < y;
		boolean isGreaterOrEqualTo = x >= y;
		boolean isLessOrEqualTo = x <= y;
		boolean isEqualTo = x == y;
		boolean NotEqualTo = x != y;
		
		
		System.out.println("------Relational Output------");
		System.out.printf("Is %d > %d = %b%n",x,y,isGreater);
		System.out.printf("Is %d < %d = %b%n",x,y,isLessThan);
		System.out.printf("Is %d >= %d = %b%n",x,y,isGreaterOrEqualTo);
		System.out.printf("Is %d <= %d = %b%n",x,y,isLessOrEqualTo);
		System.out.printf("Is %d == %d = %b%n",x,y,isEqualTo);
		System.out.printf("Is %d != %d = %b%n",x,y,NotEqualTo);
	}
}	