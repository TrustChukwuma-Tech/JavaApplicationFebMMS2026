public class InstanceMethod{
	public static void main(String[] arg){
	    InstanceMethod obj1 = new InstanceMethod();
		obj1.clap("Precious","Female");
		
		
		InstanceMethod obj2 = new InstanceMethod();
		obj2.clap("Martins","Male");
		
		InstanceMethod obj3 = new InstanceMethod();
		obj3.clap("Williams","Male");
		
		
		
	}	
    public void clap(String name,String gender){
		if (gender.equals ("Male")){
	        System.out.println(name+ " is clapping his hands");
	    } 
        else{
			System.out.println(name+ " is clapping her hands");
        }
			
	}	

}	