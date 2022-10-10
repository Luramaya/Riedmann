import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array[] = {10, 20, 12, 9, 5, 3, 55};
        System.out.println("Anfangsarray:" + Arrays.toString(array));

        int length = array.length;

        for (int i = 0; i < length - 1; i++) {

            if (array[i] > array[i + 1]) {
                int num = array[i];
                array[i] = array[i + 1];
                array[i + 1] = num;
                i = -1;
            }
        }
        System.out.println("Endarray:" + Arrays.toString(array));

    }

}