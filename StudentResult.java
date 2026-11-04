public class StudentResult{
	public static void main(String[] args){
		caculateResult(80);
		caculateResult(70, 80);
		caculateResult(70, 80, 90);
		caculateResult(82.5, 88.0);
	}
	public static void caculateResult(int score){
		System.out.println("Single score: " + score);
	}
    public static void caculateResult(int score1, int score2){
		double average = (score1 + score2) / 2.0;
		System.out.println("Average of Two Scores: " + average);
    }
    public static void caculateResult(int score1,int score2, int score3){
		double average = (score1 + score2 + score3) / 3.0;
	    System.out.println("Average of Three Scores: " + average);
    }
    public static void caculateResult(double score1,double score2){
		double average = (score1 + score2 ) / 2;
	    System.out.println("Average of Two Decemial Scores: " + average);
    }		
}	
