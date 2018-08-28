package day33;

import java.util.*;


public class LeftJoin {
    public Map leftJoin(Map<String, String> left, Map<String, String> right) {
        Map<String,List<String>> map = new HashMap<>();

        for (String key: left.keySet()) {
            List<String> list = new ArrayList<>();
            if (right.containsKey(key)) {
                list.add(left.get(key));
                list.add(right.get(key));
                map.put(key, list);
            } else {
                list.add(left.get(key));
                list.add(null);
                map.put(key, list);
            }
        }
        return map;
    }
}

