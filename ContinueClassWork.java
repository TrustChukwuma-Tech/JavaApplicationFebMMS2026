public class ContinueClassWork{
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i == 2 || i == 7 || i == 12 || i == 17 || i == 19 || i == 20){
                continue;
            }
            System.out.println(i);
        }
    }
}