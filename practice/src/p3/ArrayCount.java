package p3;

public class ArrayCount {
    public static int arrayCount(int[] arr){

        int last = arr.length - 1;
        int tallest = 0;
        int count = 0;

        while(last > 0 && last > tallest){
            tallest = arr[last];
            last--;
            count++;
        }
        return count;
    }
}
