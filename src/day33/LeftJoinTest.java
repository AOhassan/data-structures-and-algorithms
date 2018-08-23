package day33;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LeftJoinTest extends LeftJoin {

    @Test
    void leftJoinRegularTest() {
        Map<String, String> map1 = new HashMap<String, String>() {{
            put("end", "start");
            put("create", "make");
        }};
        Map<String, String> map2 = new HashMap<String, String>() {{
            put("end", "stop");
            put("create", "break");
        }};

        String[][] expected = new String[][] {
            {},
            {}
        };

        String[][] actual = leftJoin(map1, map2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void leftJoinRegularTest2() {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("create", "make");
        map2.put("create", "break");


        List<String> expected = new ArrayList<>();
        expected.add("create");
        expected.add("make");
        expected.add("break");

        Object actual = leftJoin(map1, map2);

        assertEquals(expected, actual);
    }

    @Test
    void leftJoinEmptyTest() {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();

        map1.put("complete", "full");
        map2.put("hi", "incomplete");


        List<String> expected = new ArrayList<>();
        expected.add("complete");
        expected.add("full");
        expected.add(null);

        Object actual = leftJoin(map1, map2);

        assertEquals(expected, actual);
    }

}