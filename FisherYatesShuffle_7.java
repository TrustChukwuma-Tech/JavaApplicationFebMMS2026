import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle_7 {
    public static void shuffle(int[] numbers) {
        Random random = new Random();

        for (int i = numbers.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // random index from 0 through i
            int temporary = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temporary;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
