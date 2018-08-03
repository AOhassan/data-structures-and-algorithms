package p2;

import java.util.HashSet;

public class Anagram {

    public static int anagram(String a, String b) {

        String c = a + b;
        HashSet<Character> set = new HashSet<>();

        int count = 0;
        int i = 0;
        while(i < c.length()){

            if(a.contains(c.charAt(i))){
                set.remove(c.charAt(i));
            } else {
                set.add(c.charAt(i));
            }
            i++;
        }



        return set.size();
    }
}
