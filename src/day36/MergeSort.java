package day36;

public class MergeSort {
    public static int[] mergeSort(int[] arr) {

        if (arr.length < 2) {
            return arr;
        }

        int[] L = L(arr);
        int[] R = R(arr);

        L = mergeSort(L);
        R = mergeSort(R);

        return zip(L, R);
    }

    public static int[] zip(int[] L, int[] R) {
        int i = 0;
        int j = 0;
        int[] arr = new int[L.length + R.length];

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

    public static int[] R(int[] arr) {
        int i = 0;
        int j = arr.length/2;
        int[] R = new int[arr.length - arr.length / 2];
        while (i < R.length) {
            R[i] = arr[j];
            j++;
            i++;
        }
        return R;
    }

    public static int[] L(int[] arr) {
        int[] L = new int[arr.length/2];
        for (int j = 0; j < L.length; j++) {
            L[j] = arr[j];
        }
        return L;
    }
}
