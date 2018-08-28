package practice.p5;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magMap = new HashMap<>();
        Map<String, Integer> noteMap = new HashMap<>();

        for( String word : magazine){
            if(!magMap.containsKey(word)){
                magMap.put(word, 0);
            }
            magMap.put(word, magMap.get(word) + 1);
        }

        for(String word : note){
            if(!noteMap.containsKey(word)){
                noteMap.put(word, 0);
            }
            noteMap.put(word, magMap.get(word) + 1);
        }

        for(String key : magMap.keySet()){
            if(noteMap.containsKey(key) && (Math.min(magMap.get(key), noteMap.get(key)) != 0)){
                System.out.println("Yes");
                break;
            }
        }
        System.out.println("No");
    }
}
