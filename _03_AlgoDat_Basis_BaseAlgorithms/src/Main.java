import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] data = {7, 9, 2, 31, 55, 22};

        System.out.println("-".repeat(50));
        System.out.println("Start Array:   " + Arrays.toString(data));
        System.out.println("reverted:      " + Arrays.toString(revert(data)));
        System.out.println("max Value:     " + max(data));
        System.out.println("min Value:     " + min(data));
        System.out.println("-".repeat(50));

    }

    public static int[] revert(int[] data) {

        int length = data.length;
        //tauscht eine Linke gegen eine Rechte Zahl aus der gleichen Position aus der Mitte gesehen
        for (int i = 0; i < length / 2; i++) {
            int num = data[i];
            data[i] = data[length - (i + 1)];
            data[length - (i + 1)] = num;
        }
        return data;
    }

    public static int max(int[] data) {

        int length = data.length;
        int max = data[0];
        for (int i = 0; i < length; i++) {

            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data) {
        int length = data.length;
        int min = data[0];
        for (int i = 0; i < length; i++) {

            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }
}