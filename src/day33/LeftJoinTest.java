package day33;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class LeftJoinTest extends LeftJoin {

    @Test
    void leftJoinShortTest() {

        Map map1 = new HashMap<String, String>() {{
            put("end", "stop");
        }};
        Map map2 = new HashMap<String, String>() {{
            put("end", "start");
        }};

        List<String> list1 = new ArrayList<>();
        list1.add("stop");
        list1.add("start");

        Map<String,List<String>> expected = new HashMap();
        expected.put("end", list1);


        Map<String,List<String>> actual = leftJoin(map1, map2);

        assertEquals(expected, actual);
    }

    @Test
    void leftJoinLongTest() {

        Map map1 = new HashMap<String, String>() {{
            put("end", "stop");
            put("create", "make");
            put("complete", "finished");
        }};
        Map map2 = new HashMap<String, String>() {{
            put("end", "start");
            put("create", "break");
            put("complete", "incomplete");
        }};

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();

        list1.add("stop");
        list1.add("start");
        list2.add("make");
        list2.add("break");
        list3.add("finished");
        list3.add("incomplete");

        Map<String,List<String>> expected = new HashMap();
        expected.put("end", list1);
        expected.put("create", list2);
        expected.put("complete", list3);

        Map<String,List<String>> actual = leftJoin(map1, map2);

        assertEquals(expected, actual);
    }

    @Test
    void leftJoinEmptyTest() {
        Map map1 = new HashMap<String, String>() {{
            put("end", "stop");
            put("create", "make");
        }};
        Map map2 = new HashMap<String, String>() {{
            put("hi", "start");
            put("hey", "break");
        }};

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("stop");
        list1.add(null);
        list2.add("make");
        list2.add(null);


        Map<String,List<String>> expected = new HashMap();
        expected.put("end", list1);
        expected.put("create", list2);

        Map<String,List<String>> actual = leftJoin(map1, map2);

        assertEquals(expected, actual);
    }

}