public class Exercise6_11{
   public static void main(String[] args)
   {
      int[] counts = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
      int[] bonus = new int[15];
      int[] bestScores = {97, 88, 92, 75, 100};

      // a) Set the 10 elements of integer array counts to zero
      for (int i = 0; i < counts.length; i++)
         counts[i] = 0;

      // b) Add one to each of the 15 elements of integer array bonus
      for (int i = 0; i < bonus.length; i++)
         bonus[i]++;

      // c) Display the five values of integer array bestScores in column format
      for (int score : bestScores)
         System.out.println(score);

      // quick check of a) and b)
      System.out.println("counts[0..9] all zero? " + java.util.Arrays.toString(counts));
      System.out.println("bonus all one? " + java.util.Arrays.toString(bonus));
   }
}