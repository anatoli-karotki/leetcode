import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"и", "а", "д", "с", "с", "л", "о", "т"};


        run(31, 3, false);
    }


    private static int run(int num, int i, boolean b){
        int value = b ? 1 : 0;
        int mask = ~(1 << i);
        int result1 = num & mask;
        int result2 = value << i;
        int result = result1 | result2;
        return result;
    }

}
