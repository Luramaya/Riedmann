import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> inputList){

        for (int i = inputList.size() - 1; i >= 0; i--) {
            int currentInt = inputList.get(i);

            for (int j = inputList.size() - 1; j >= 0 ; j--) {

                int loopInt = inputList.get(j);

                if (currentInt > inputList.get(j)){

                }


            }



        }

    }


    public static int[] generateDataArray(int size){
        int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
        }
        return data;
    }


}