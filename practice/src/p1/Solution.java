package p1;

public class Solution {
    public static int[] rotLeft(int[] a, int d){
        int[] result = new int[a.length];

        for(int i = 0; i < a.length; i++){

            if(i-d < 0){
                result[a.length + (i-d)] = a[i];
            }
            else {
                result[i-d] = a[i];
            }
        }

        return result;
    }
}
