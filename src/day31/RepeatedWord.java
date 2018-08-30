package day31;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {
    public static String repeatedWord(String sentence){
        String[] words = sentence.toLowerCase().split("\\W+");
        Set<String> set = new HashSet<>();

        for(String word : words){
            if(!set.contains(word)){
                set.add(word);
                continue;
            }
            return word;
        }
        return "No repeated words";
    }
}
