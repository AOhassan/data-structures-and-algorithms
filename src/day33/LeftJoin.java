package day33;

import java.util.Map;


public class LeftJoin {
    public String[][] leftJoin(Map<String, String> left, Map<String, String> right) {
        String arr[][] = new String[left.size()][];

        for(int i = 0; i < arr.length; i++) {
            for (Map.Entry<String, String> entry : left.entrySet()) {
                String leftKey = entry.getKey();
                String leftValue = entry.getValue();

                if (right.containsKey(leftKey)) {
                    arr[i][0] = leftKey;
                    arr[i][1] = leftValue;
                    arr[i][2] = right.get(leftKey);
                } else {
                    arr[i][0] = leftKey;
                    arr[i][1] = leftValue;
                    arr[i][1] = null;
                }
            }
        }
        return arr;
    }
}
