public class LocalVariable2{
	public static void main(String[] args){
		checkNumber(); 
		
	}
    public static void checkNumber(){
		int x = 30;
		
		if (x == 30){
			System.out.printf("Hello %d, you are equal to 30",x);	
        }
        else{
			System.out.printf("Sorry %d, you are not equal to 30",x);
			
	    }
	}
}	