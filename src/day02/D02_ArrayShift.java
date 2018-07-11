package day02;
import java.math.*;

public class D02_ArrayShift {
    public static void insertShiftArray(int[] arr, int num){

        int[] result = new int[arr.length + 1];
        int half = (int) Math.ceil(arr.length/2);

        int i = 0;
        int j = 0;

        if (i < half) {
            arr[i] = result[j];
        }

        else if (i == half)  {
            result[i] = num;
        }
        else  {
            arr[i] = result[j+1];
        }

        i++;
        j++;

    }
}

