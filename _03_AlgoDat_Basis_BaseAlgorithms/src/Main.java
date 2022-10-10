import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int array[] = {20, 2, 1, 9, 5, 3, 5};
        System.out.println("Anfangsarray:" + Arrays.toString(array));

        int length = array.length;
    public static int[] revert(int[] data){

        }
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