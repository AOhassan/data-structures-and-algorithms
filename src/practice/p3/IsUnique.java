package practice.p3;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static boolean isUnique(String s){
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = (s.charAt(i) == ' ') ? s.charAt(i++) : s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
            }
            return false;
        }
        return true;
    }
}
