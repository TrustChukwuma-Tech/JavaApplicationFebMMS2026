public class MethodCall{
	public static void main(String[] args){
		checkAge(25);
		int x = 10;
	}	
    public static void checkAge(int age){ 
        if(age >= 18){
			System.out.println("Adult");
        }			
	    else{
			System.out.println("Minor");
        }			
	    greetings(); 
    }
	public static void greetings(){
		System.out.println("Hello Everyone");
		addMe(2,15);
	}   
    public static void addMe(int x, int y){
		int sum = x + y;
		System.out.println(sum);
    }		
}	