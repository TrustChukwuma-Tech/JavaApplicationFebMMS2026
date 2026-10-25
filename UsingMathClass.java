public class UsingMathClass{
	public static void main(String[] args){
		int absoluteNumber = Math.abs(-200);
		double maximunNumber = Math.max(12,3);
		double minimunNumber = Math.min(12,3);
		double squareRoot = Math.sqrt(64);
		double power = Math.pow(64,2); 
		double randomNumber = Math.random();
		
		
		System.out.println("The value is " + absoluteNumber);
		System.out.println("The value is " + maximunNumber);
		System.out.println("The value is " + minimunNumber);
		System.out.println("The value is " + squareRoot);
		System.out.println("The value is " + power);
		System.out.printf("The value is %.2f%n", randomNumber);
    }
}	