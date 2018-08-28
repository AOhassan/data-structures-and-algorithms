package practice.p4;


import java.util.HashMap;
import java.util.Map;


public class MakeAnagram {
    public static int makeAnagram(String a, String b) {
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        int remove = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (!mapA.containsKey(ch)) {
                mapA.put(ch, 0);
            }
            mapA.put(ch, mapA.get(ch) + 1);
        }
        for (int j = 0; j < b.length(); j++) {
            char ch = b.charAt(j);
            if (!mapB.containsKey(ch)) {
                mapB.put(ch, 0);
            }
            mapB.put(ch, mapB.get(ch) + 1);
        }

        for (Character key : mapA.keySet()) {
            if (mapB.containsKey(key)) {
                remove += 2 * Math.min(mapA.get(key), mapB.get(key));
            }
        }

    return a.length() + b.length() - remove;
    }
}
