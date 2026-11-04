import java.util.Random;

public class PassWordGenerator{
	public  static void main(String[] args){
		Random rand = new Random();
		
		String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*";

        String allCharacter = lowerCase + upperCase + numbers +specialCharacters;

        String password = "";

        for(int i = 1; i <= 15; i++){
			int index = rand.nextInt(allCharacter.length());
			
			char characters = allCharacter.charAt(index);
			
			password = password + characters;
			
			
			
        }
		System.out.printf("The generated password is %s%n",password);			
	}	
}	