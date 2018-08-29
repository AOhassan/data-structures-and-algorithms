package day37;

import java.util.Random;

public class Sort {
    public static double[] insertionSort(double[] arr){
        for(int left = 1; left < arr.length; left++){
            for(int right = left; right > 0; right--){
                if(arr[right] < arr[right - 1]){
                    double swap = arr[right];
                    arr[right] = arr[right - 1];
                    arr[right - 1] = swap;
                }
            }
        }
        return arr;
    }

    public static double[] mergeSort(double[] arr) {

        if (arr.length < 2) {
            return arr;
        }

        double[] L = L(arr);
        double[] R = R(arr);

        L = mergeSort(L);
        R = mergeSort(R);

        return zip(L, R);
    }

    public static double[] zip(double[] L, double[] R) {
        int i = 0;
        int j = 0;
        double[] arr = new double[L.length + R.length];

        while (i < L.length && j < R.length) {
            if(L[i] < R[j]){
                arr[i + j] = L[i];
                i++;
            }
            else{
                arr[i + j] = R[j];
                j++;
            }
        }
        while (i < L.length) {
            arr[i + j] = L[i];
            i++;
        }
        while (j < R.length) {
            arr[i + j] = R[j];
            j++;
        }
        return arr;
    }

    public static double[] R(double[] arr) {
        int i = 0;
        int j = arr.length/2;
        double[] R = new double[arr.length - arr.length / 2];
        while (i < R.length) {
            R[i] = arr[j];
            j++;
            i++;
        }
        return R;
    }

    public static double[] L(double[] arr) {
        double[] L = new double[arr.length/2];
        for (int j = 0; j < L.length; j++) {
            L[j] = arr[j];
        }
        return L;
    }

    public static boolean isSorted(double[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static double[] randomArray(int size){
        double[] arr = new double[size];

        for(int i = 0; i < size; i++){
            Random r = new Random();
            double dd = r.nextDouble();
            arr[i] = dd;
        }
        return arr;
    }

    public static double[] arrayCopy(double[] arr){
        double[] result = new double[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }
        return result;
    }
}
