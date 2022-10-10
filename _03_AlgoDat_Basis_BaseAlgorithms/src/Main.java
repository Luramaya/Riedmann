import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] data = {7, 9, 2, 31, 55, 22};
        System.out.println("Anfangsarray:" + Arrays.toString(data));
        revert(data);
        System.out.println("Endarray:" + Arrays.toString(data));

    }

        public static int[] revert ( int[] data){

            int length = data.length;
            //tauscht eine Linke gegen eine Rechte Zahl aus der gleichen Position aus der Mitte gesehen
            for (int i = 0; i < length / 2; i++) {
                int num = data[i];
                data[i] = data[length - (i + 1)];
                data[length - (i + 1)] = num;
            }
            return data;
        }
    }