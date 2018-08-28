package day36;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int start, int end){
        int mid = (end - start)/2;
        if(end == start){
            int[] L = new int[mid - start];
            int[] R = new int[end - mid + 1];
            zip(arr, L, R);
        }
        mergeSort(arr, 0, mid);
        mergeSort(arr, mid + 1, end);
        return arr;
    }

    public static int[] zip(int[] arr, int[] L, int[] R){
        int i =0;
        int j = 0;
        int k =0;

        while(k < arr.length ){
            if(i == L.length){
                arr[k] = R[j];
                continue;
            }
            if(j == R.length){
                arr[k] = L[i++];
                continue;
            }
            arr[k] = (L[i] < R[j]) ? L[i++] : R[j++];
        }
        return arr;
    }

}
