package p2;

import java.util.HashSet;

public class Anagram {

    public static int anagram(String a, String b) {

        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        int count = 0;
        while (!arrayA.equals(arrayB)) {
            count++;
        }
        return count;
    }
}
