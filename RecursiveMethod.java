public class RecursiveMethod{
	public static void main(String[] args){
		greetings();
	}
    public static void greetings(){
		System.out.println("Good afternoon");
		
		greetings();
    }		
}
