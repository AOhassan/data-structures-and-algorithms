package day01;

public class D01_ArrayReverse {
    public static void arrayReverse(int[] aa) {

        int sub = 0;
        int i = 0;
        int j = aa.length - 1;
        while (i < j){

            sub = aa[i];
            aa[i] = aa[j];
            aa[j] = sub;

            i++;
            j--;
        }
    }
}

