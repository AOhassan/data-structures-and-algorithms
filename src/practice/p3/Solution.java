package practice.p3;

public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] result = new int[a.length];
        int i = a.length - 1;
        int k = a.length % d;

        while(i >= 0) {

            if(i-d >= 0 ){
                result[i-d] = a[i];
            }
            else {
                result[i - k] = a[i];
                k++;
            }

            i--;

        }

        return result;
    }
}
