import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] data = {10, 20, 23, 33, 20, 22, 110, 204};
        System.out.println("Anfangsarray:" + Arrays.toString(data));
        sort(data);
        System.out.println("Endarray:" + Arrays.toString(data));

    }

    public static int[] sort(int[] data) {

        int length = data.length;

        for (int i = 0; i < length - 1; i++) {

            if (data[i] > data[i + 1]) {
                int num = data[i];
                data[i] = data[i + 1];
                data[i + 1] = num;
                i = -1;
            }
        }
        return data;
    }
}